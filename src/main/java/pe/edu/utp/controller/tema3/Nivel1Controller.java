package pe.edu.utp.controller.tema3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel1Controller {

    @FXML
    private WebView code1;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema3/t3n1_1.html").toExternalForm());
    }

    @FXML
    void handleaactionbtn(ActionEvent event) throws Exception {
        App.setRoot("tema3/Nivel1Quizz1View");
    }

}
