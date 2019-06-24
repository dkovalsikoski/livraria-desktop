package testes;

import DAO.AutorDAO;
import DAO.EditoraDAO;
import DAO.LivroDAO;
import model.Autor;
import model.Editora;
import model.Livro;

import java.sql.Date;
import java.time.LocalDate;

public class TestarInserir {
   public static void main(String[] args) {
   /*   Autor autor = new Autor();
        autor.setNome("joão Oliveira");
        autor.setEmail("jose.oliveira@gmail.com");

        AutorDAO autorDAO = new AutorDAO();
        autorDAO.inserirAutor(autor);

    }

    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.setNome("Teste Editora 1");
        editora.setEmail("testeeditora@hotmail.com");
        EditoraDAO editoraDAO = new EditoraDAO();
        editoraDAO.inserirEditora(editora);

    }*/
       Editora editora = new Editora();
       EditoraDAO editoraDAO = new EditoraDAO();
       Livro livro = new Livro();
       livro.setTitulo("Livro Teste");
       livro.setData_lacamento(LocalDate.parse("2008-05-06"));
       livro.setQuantidade(3);
       livro.setPreco(35);
       livro.setEditora_id(editoraDAO.listarPorIdEditora(2));

       LivroDAO livroDAO = new LivroDAO();
       livroDAO.inserirLivro(livro);




   }
}

