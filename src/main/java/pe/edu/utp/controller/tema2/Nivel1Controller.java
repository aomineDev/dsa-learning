package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel1Controller {

    @FXML
    private WebView code1;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema2/Nivel" + nivel + "View");
    }

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n1_1.html").toExternalForm());
        nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

    @FXML
    void handleaactionbtn(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1Quizz1View");
    }
}
