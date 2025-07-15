package pe.edu.utp.controller.tema3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel3Controller {

    @FXML
    private WebView code1;

    @FXML
    private ComboBox<String> nivelSelector;

    private String tema;
    private int nivel;

    @FXML
    void initialize() {
        tema = "tema" + 3;
        nivel = 3;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code1, 1);

        n.setNivelItems(nivelSelector, 7);
    }

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema3/Nivel" + nivel + "View");
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws IOException {
        App.setRoot("tema3/Nivel3Quizz1View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

}