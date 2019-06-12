package testes;

import DAO.AutorDAO;
import model.Autor;

import java.util.List;

public class TestarListar {
    public static void main(String[] args) {
        AutorDAO autorDAO = new AutorDAO();
        List<Autor> autores = autorDAO.listarTodos();

        for(Autor autor: autores){
            System.out.println(autor.getId()+ " - " + autor.getNome() + " - " + autor.getEmail());

        }
    }

}
