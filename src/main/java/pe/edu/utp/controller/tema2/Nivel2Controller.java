package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel2Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    private WebView code3;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2_1.html").toExternalForm());
        code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2_2.html").toExternalForm());
        code3.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2_3.html").toExternalForm());
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

    @FXML
    void handleaactionbtn(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel2Quizz1View");
    }

}
