package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel3Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n3_1.html").toExternalForm());
        code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n3_2.html").toExternalForm());
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel3Quizz1View");
    }

}
