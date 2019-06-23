package testes;

import DAO.AutorDAO;
import model.Autor;

public class TestarAlterar {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("João Vieira");
        autor.setEmail("joão.ovelino@gmail.com");
        autor.setId(15);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.alterarAutor(autor);
    }
}
