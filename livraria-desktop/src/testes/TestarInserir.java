package testes;

import DAO.AutorDAO;
import DAO.EditoraDAO;
import model.Autor;
import model.Editora;

public class TestarInserir {
   public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("joão Oliveira");
        autor.setEmail("jose.oliveira@gmail.com");

        AutorDAO autorDAO = new AutorDAO();
        autorDAO.inserir(autor);

    }

    /*public static void main(String[] args) {
        Editora editora = new Editora();
        editora.setNome("Teste Editora 1");
        editora.setEmail("testeeditora@hotmail.com");
        EditoraDAO editoraDAO = new EditoraDAO();
        editoraDAO.inserirEditora(editora);

    }*/
}

