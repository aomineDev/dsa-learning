package pe.edu.utp.controller.tema8;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel5Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    private WebView code3;

    @FXML
    private WebView code4;

    @FXML
    private WebView code5;

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 8;
        nivel = 5;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code1, 1);
        n.setCodeView(code2, 2);
        n.setCodeView(code3, 3);
        n.setCodeView(code4, 4);
        n.setCodeView(code5, 5);

        n.setNivelItems(nivelSelector, 5);
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot(tema + "/Nivel5View");
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
