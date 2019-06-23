package testes;

import DAO.AutorDAO;
import model.Autor;

public class TestarListarPorID {

    public static void main(String[] args) {
        AutorDAO autorDAO = new AutorDAO();
        Autor autor = autorDAO.listarPorId(1);

        //Tem o alterar aqui junto, quase tomei no cu pq esqueci essa merda
        autor.setEmail("celso.oliveiro@bol.com.br");
        autor.setNome("Celso Oliveira");

        AutorDAO autorDAOAltera = new AutorDAO();
        autorDAOAltera.alterarAutor(autor);
    }
}
