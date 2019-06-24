package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    public void viewEditora(){
        try{
            Stage tela  = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/inserir_editora.fxml"));
            tela.setTitle("Controle de Editoras");
            tela.setScene(new Scene(root, 518,610));
            tela.show();
        }catch (IOException e){
            System.out.println("Desculpe, não foi possível.");
            e.printStackTrace();
        }
    }
    public void viewAutor(){
        try{
            Stage tela  = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/autor_formulario.fxml"));
            tela.setTitle("Controle de Autores");
            tela.setScene(new Scene(root, 639,412));
            tela.show();
        }catch (IOException e){
            System.out.println("Desculpe, não foi possível.");
            e.printStackTrace();
        }
    }
    public void viewLivro(){
        try{
            Stage tela  = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/inseir_livro.fxml"));
            tela.setTitle("Controle de Livros");
            tela.setScene(new Scene(root, 910,600));
            tela.show();
        }catch (IOException e){
            System.out.println("Desculpe, não foi possível.");
            e.printStackTrace();
        }
    }
}

