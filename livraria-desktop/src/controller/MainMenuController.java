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
}
