package pe.edu.utp.controller.tema2;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import pe.edu.utp.App;

public class Nivel2Quizz1Controller {

    @FXML
    private WebView code1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2q1_1.html").toExternalForm());
    }

    @FXML
    void handleActionBtn1(ActionEvent event) throws Exception{
        btn1.getStyleClass().add("btn-quizz--success");
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--error");

        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema2/Nivel3View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();
    }

    @FXML
    void handleActionBtn2(ActionEvent event) throws Exception{
        btn1.getStyleClass().remove("btn-quizz--success");
        btn2.getStyleClass().add("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--error");
    }

    @FXML
    void handleActionBtn3(ActionEvent event) throws Exception{
        btn1.getStyleClass().remove("btn-quizz--success");
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().add("btn-quizz--error");
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

}
