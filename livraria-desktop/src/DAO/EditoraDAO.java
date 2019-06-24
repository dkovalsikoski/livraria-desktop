package DAO;

import model.Autor;
import model.Editora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditoraDAO {
    private Connection conexao;

    public EditoraDAO() {
        conexao = new ConnectionFactory().getConnection();
    }

    public void inserirEditora(Editora editora) {
        String sql = "insert into editoras (nome, site, endereco, bairro, telefone) values (?,?,?,?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, editora.getNome());
            stmt.setString(2, editora.getSite());
            stmt.setString(3, editora.getEndereco());
            stmt.setString(4, editora.getBairro());
            stmt.setInt(5, editora.getTelefone());

            stmt.execute();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Editora> listarTodosEditora() {
        String sql = "select * from editoras";
        List<Editora> editora = new ArrayList<>();

        try {
            //prepara a conexão
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //executa
            ResultSet resultado = stmt.executeQuery();

            //percorre os resultados de editora

            while (resultado.next()) {
                Editora editoras = new Editora();
                editoras.setId(resultado.getInt("id"));
                editoras.setNome(resultado.getString("nome"));
                editoras.setSite(resultado.getString("site"));
                editoras.setEndereco(resultado.getString("endereco"));
                editoras.setBairro(resultado.getString("bairro"));
                editoras.setTelefone(resultado.getInt("telefone"));

                editora.add(editoras);
                System.out.println("Blz, parece que deu tudo certo.");
            }
            //fecha conexao
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Parece que deu cagadinha");
            throw new RuntimeException(e);

        }
        return editora;
    }
    public Editora listarPorIdEditora(int id){
        String sql = "select * from editoras where id = ?";

        Editora editora = new Editora();

        try{
            //Prepara conexão
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,id);

            //Executa
            ResultSet resultadoRs = stmt.executeQuery();
            resultadoRs.next();

            //Populando o objeto
            editora.setId(resultadoRs.getInt("id"));
            editora.setNome(resultadoRs.getString("nome"));
            editora.setSite(resultadoRs.getString("site"));
            editora.setEndereco(resultadoRs.getString("endereco"));
            editora.setBairro(resultadoRs.getString("bairro"));
            editora.setTelefone(resultadoRs.getInt("telefone"));

            //Fechar conexão
            conexao.close();

        }catch (SQLException e){
            System.out.println("Parece que não foi desssa vez");
            throw  new RuntimeException(e);
        }

        return editora;
    }

    public void alteraEditora(Editora editora){
        String sql = "update editoras set nome =?, site=?, endereco=?, bairro=?, telefone=? where id = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, editora.getNome());
            stmt.setString(2, editora.getSite());
            stmt.setString(3, editora.getEndereco());
            stmt.setString(4, editora.getBairro());
            stmt.setInt(5, editora.getTelefone());
            stmt.setInt(6,editora.getId());

            stmt.execute();
            System.out.println("Deu bom");
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public void deletarEditora(Editora editora){
        String sql = "delete from editoras where id = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, editora.getId());
            stmt.execute();
            System.out.println("Foi pro saco");
            stmt.close();
        }catch (SQLException e){
            System.out.printf("Deu ruim parça");
            throw new RuntimeException(e);
        }
    }
}

