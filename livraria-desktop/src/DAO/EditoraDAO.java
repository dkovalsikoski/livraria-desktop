package DAO;

import model.Editora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditoraDAO {
    private Connection conexao;

    public EditoraDAO() {conexao = new ConnectionFactory().getConnection();
    }

    public void inserirEditora(Editora editora) {
        String sql = "insert into editoras (nome, email, endereco, bairro, telefone) values (?,?,?,?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, editora.getNome());
            stmt.setString(2, editora.getEmail());
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
                editoras.setEmail(resultado.getString("email"));
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

    public void alteraEditora(Editora editora){
        String sql = "update editoras set nome =?, email=?, endereco=?, bairro=?, telefone=? where id = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, editora.getNome());
            stmt.setString(2, editora.getEmail());
            stmt.setString(3, editora.getEndereco());
            stmt.setString(4, editora.getBairro());
            stmt.setInt(5, editora.getTelefone());

            stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public void deletar(int id){
        String sql = "delete from editoras where id =?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("Foi pro saco");
            stmt.close();
        }catch (SQLException e){
            System.out.printf("Deu ruim parça");
            throw new RuntimeException(e);
        }
    }


}

