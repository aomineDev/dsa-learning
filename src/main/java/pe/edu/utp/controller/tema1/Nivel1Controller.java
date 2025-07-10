package pe.edu.utp.controller.tema1;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

import java.io.IOException;

import javafx.event.ActionEvent;

public class Nivel1Controller {
    @FXML
    private WebView code;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void initialize() {
        code.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema1/t1n1.html").toExternalForm());
        nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5");
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema1/Nivel1QUizz1View");
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
