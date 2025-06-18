package pe.edu.utp.controller.tema2;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel2Quizz1Controller {

    @FXML
    private WebView code1;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2q1_1.html").toExternalForm());
    }

}
