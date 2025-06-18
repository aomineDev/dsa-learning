package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel4Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n4_1.html").toExternalForm());
        code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n4_2.html").toExternalForm());
    }

    @FXML
    void handleaactionbtn(ActionEvent event) {

    }

}
