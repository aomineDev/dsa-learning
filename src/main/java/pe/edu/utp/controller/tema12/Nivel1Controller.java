package pe.edu.utp.controller.tema12;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel1Controller {

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 12;
        nivel = 1;

        Nivel n = new Nivel(tema, nivel);

        n.setNivelItems(nivelSelector, 3);
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot(tema + "/Nivel2View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot(tema + "/Nivel" + nivel + "View");
    }

}