package pe.edu.utp.controller.tema8;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel2Controller {

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 8;
        nivel = 2;

        Nivel n = new Nivel(tema, nivel);

        n.setNivelItems(nivelSelector, 5);
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot(tema + "/Nivel3View");
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