package pe.edu.utp.controller.tema1;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Nivel2Controller {
    @FXML
    private WebView code;

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 1;
        nivel = 2;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code, 1);

        n.setNivelItems(nivelSelector, 5);
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema1/Nivel3View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema1/Nivel" + nivel + "View");
    }
}