package testes;

import DAO.AutorDAO;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import model.Autor;
import model.Editora;
import model.Livro;

import java.time.LocalDate;

public class TestarAlterar {
    public static void main(String[] args) {
       /* Autor autor = new Autor();
        autor.setNome("João Vieira");
        autor.setEmail("joão.ovelino@gmail.com");
        autor.setId(15);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.alterarAutor(autor);

        EditoraDAO editoraDAO = new EditoraDAO();
        Livro livro = new Livro();
        livro.setTitulo("jubileu esta estranho");
        livro.setData_lacamento(LocalDate.parse("2019-05-15"));
        livro.setQuantidade(30);
        livro.setPreco(50);
        livro.setEditora_id(editoraDAO.listarPorIdEditora(2));
        livro.setId(8);

        LivroDAO livroDAO = new LivroDAO();
        livroDAO.alterarLivro(livro);
        */

        Editora editora = new Editora();
        editora.setNome("Jubileu");
        editora.setSite("jubileu.host.com");
        editora.setTelefone(33222654);
        editora.setEndereco("no dia que eu sai de casa");
        editora.setBairro("i5");
        editora.setId(2);

        EditoraDAO editoraDAO = new EditoraDAO();
        editoraDAO.alteraEditora(editora);


    }

}
