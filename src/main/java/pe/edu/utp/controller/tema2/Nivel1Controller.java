package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel1Controller {

    @FXML
    private WebView code1;

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 2;
        nivel = 1;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code1, 1);

        n.setNivelItems(nivelSelector, 5);
    }

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot(tema + "/Nivel" + nivel + "View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

    @FXML
    void handleaactionbtn(ActionEvent event) throws Exception {
        App.setRoot(tema + "/Nivel1Quizz1View");
    }

}
