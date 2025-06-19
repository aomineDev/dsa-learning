package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel5Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    private WebView code3;

    @FXML
    private WebView code4;

    @FXML
    private WebView code5;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5_1.html").toExternalForm());
        code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5_2.html").toExternalForm());
        code3.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5_3.html").toExternalForm());
        code4.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5_4.html").toExternalForm());
        code5.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5_5.html").toExternalForm());
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel5Quizz1View");
    }

}
