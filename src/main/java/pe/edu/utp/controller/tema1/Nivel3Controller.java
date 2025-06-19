package pe.edu.utp.controller.tema1;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Nivel3Controller {
    @FXML
    private WebView code;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void initialize() {
        code.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema1/t1n3.html").toExternalForm());
        nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5");
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema1/Nivel3Quizz1View");
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