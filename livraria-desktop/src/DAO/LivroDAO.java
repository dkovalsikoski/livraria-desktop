package DAO;

import model.Autor;
import model.Editora;
import model.Livro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private Connection conexao;

    public LivroDAO() {
        conexao = new ConnectionFactory().getConnection();
    }

    public void inserirLivro(Livro livro){
        String sql = "insert into livros (titulo, data_lancamento, quantidade, preco, editora_id) values (?,?,?,?,?)";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, livro.getTitulo());
            stmt.setDate(2, Date.valueOf(livro.getData_lacamento()));
            stmt.setInt(3, livro.getQuantidade());
            stmt.setFloat(4, livro.getPreco());
            stmt.setInt(5, livro.getEditora_id().getId());

            stmt.execute();
            System.out.println("O individuo ta lá");
            conexao.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public List<Livro> listarTodosLivros(){
        String sql = "select * from livros";
        List<Livro> livros = new ArrayList<>();

        try{
            //preparar conexão
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //executar
            ResultSet resultados = stmt.executeQuery();

            //percorrer os resultados
            while (resultados.next()){
                Livro liv = new Livro();
                liv.setTitulo(resultados.getString("titulo"));
                liv.setData_lacamento(LocalDate.parse(resultados.getDate("data_lancamento").toString()));
                liv.setQuantidade(resultados.getInt("quantidade"));
                liv.setPreco(resultados.getFloat("preco"));
              //  liv.setEditora_id(new LivroDAO().listarPorId(resultados.getInt("editora_id")));

                livros.add(liv);

            }
            //fechar a conexão
            conexao.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return livros;
    }
    public void alterarLivro(Livro livro){
        String sql = "update livros set titulo=?,data_lancamento=?,quantidade=?,preco=?, editora_id=? where id=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setDate(2, Date.valueOf(livro.getData_lacamento()));
            stmt.setInt(3, livro.getQuantidade());
            stmt.setFloat(4, livro.getPreco());
            stmt.setInt(5, livro.getEditora_id().getId());

            stmt.execute();

            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void deletarLivro(Livro livro) {

        String sql = "delete from livros where id=?";

        try {
            PreparedStatement st = conexao.prepareStatement(sql);

            st.setInt(1, livro.getId());

            st.execute();
            System.out.println("Beleza irmão, deu certo.");
            st.close();
            conexao.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Livro listarPorIdLivro(int id){
        String sql = "select * from livros where id = ?";

        Livro livros = new Livro();

        try{
            //Prepara conexão
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,id);

            //Executa
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            //Populando o objeto
            livros.setId(resultado.getInt("id"));
            livros.setTitulo(resultado.getString("titulo"));
            livros.setData_lacamento(LocalDate.parse(resultado.getDate("data_lancamento").toString()));
            livros.setQuantidade(resultado.getInt("quantidade"));
            livros.setPreco(resultado.getFloat("preco"));
           // livros.setEditora_id(resultado.getInt("editora_id"));

            //Fechar conexão
            conexao.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

        return livros;
    }
}


