package testes;

import DAO.AutorDAO;
import model.Autor;

public class TestarListarPorID {

    public static void main(String[] args) {
        AutorDAO autorDAO = new AutorDAO();
        Autor autor = autorDAO.listarPorId(1);

        autor.setEmail("celso.oliveiro@bol.com.br");
        autor.setNome("Celso Oliveira");

       AutorDAO autorDAOAltera = new AutorDAO();
       autorDAOAltera.alterar(autor);
    }
}
