package pe.edu.utp.controller.tema7;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel1Controller {
    private String tema;
    private int nivel;

    @FXML
    private WebView code;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void initialize() {
        tema = "tema" + 7;
        nivel = 1;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code, 1);

        n.setNivelItems(nivelSelector, 6);
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
