package testes;

import DAO.AutorDAO;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import model.Autor;
import model.Editora;
import model.Livro;

public class TestarDeletar {
    /*public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setId(16);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.deletarAutor(autor);

    }*/

   /* public static void main(String[] args) {
        Editora editora = new Editora();
        editora.setId(6);
        EditoraDAO editoraDAO = new EditoraDAO();
        editoraDAO.deletarEditora(editora);
    }*/
   public static void main(String[] args) {
       Livro livro = new Livro();
       livro.setId(11);
       LivroDAO livroDAO = new LivroDAO();
       livroDAO.deletarLivro(livro);
   }

}
