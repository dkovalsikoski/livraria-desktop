package controller;

import DAO.EditoraDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Editora;

import java.net.URL;
import java.util.ResourceBundle;

public class InserirEditoraController {

    public class EditoraFormularioController implements Initializable {

        @FXML private TableView<Editora> tb_editoras = new TableView<>();
        @FXML private TableColumn<Editora, Integer> tb_id = new TableColumn<>("id");
        @FXML
        private TableColumn<Editora, String> tb_nome = new TableColumn<>("nome");
        @FXML
        private TableColumn<Editora, String> tb_site = new TableColumn<>("site");
        @FXML
        private TableColumn<Editora, String> tb_telefone = new TableColumn<>("telefone");
        @FXML
        private TableColumn<Editora, String> tb_endereco = new TableColumn<>("endereco");
        @FXML
        private TableColumn<Editora, String> tb_bairro = new TableColumn<>("bairro");

        @FXML private TextField txt_id;
        @FXML private TextField txt_nome;
        @FXML private TextField txt_site;
        @FXML private TextField txt_telefone;
        @FXML private TextField txt_bairro;
        @FXML private TextField txt_endereco;

        Editora editora = new Editora();
        EditoraDAO editoraDao = new EditoraDAO();

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            txt_id.setDisable(true);
            txt_nome.requestFocus();
            txt_nome.setFocusTraversable(true);
            editoraDao.idNext();
            editoraDao.listarTodosEditora();
            tb_editoras.setEditable(true);






    }
    }
}
