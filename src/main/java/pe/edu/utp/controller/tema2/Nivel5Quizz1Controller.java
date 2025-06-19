package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel5Quizz1Controller {

    @FXML
    private WebView code1;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5q1_1.html").toExternalForm());
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

}
