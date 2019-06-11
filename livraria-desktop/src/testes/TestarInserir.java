package testes;

import DAO.AutorDAO;
import model.Autor;

public class TestarInserir {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("José Oliveira");
        autor.setEmail("jose.oliveira@gmail.com");

        AutorDAO autorDAO = new AutorDAO();
        autorDAO.inserir(autor);

    }
}
