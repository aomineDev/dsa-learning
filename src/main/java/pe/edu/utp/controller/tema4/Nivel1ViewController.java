package pe.edu.utp.controller.tema4;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import pe.edu.utp.App;

public class Nivel1ViewController {
    @FXML
    void avanzar(ActionEvent event) throws Exception {

        App.setRoot("tema4/Nivel1Quizz1View");
    }

    @FXML
    void retroceder(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

    @FXML
    void initialize() {
        idselector.getItems().addAll("nivel 1", "nivel 2");
    }

    @FXML
    private ComboBox<String> idselector;

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = idselector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema4/Nivel" + nivel + "View");
    }

}
