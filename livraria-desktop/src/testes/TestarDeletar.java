package testes;

import DAO.AutorDAO;
import DAO.EditoraDAO;
import model.Autor;
import model.Editora;

public class TestarDeletar {
    /*public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setId(16);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.deletar(autor);

    }*/

    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.setId(6);
        EditoraDAO editoraDAO = new EditoraDAO();
        editoraDAO.deletarEditora(editora);
    }
}
