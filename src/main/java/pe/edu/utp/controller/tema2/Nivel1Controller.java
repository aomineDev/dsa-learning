package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel1Controller {

    @FXML
    private WebView code1;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n1_1.html").toExternalForm());
    }

    @FXML
    void handleaactionbtn(ActionEvent event) {

    }
}
