package pe.edu.utp.controller.tema2;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;
import pe.edu.utp.App;

public class Nivel1Quizz1Controller {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    void handleActionBtn1(ActionEvent event) throws Exception{
        btn1.getStyleClass().add("btn-quizz--error");
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--success");
    }

    @FXML
    void handleActionBtn2(ActionEvent event) throws Exception{
        btn1.getStyleClass().remove("btn-quizz--error");
        btn2.getStyleClass().add("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--success");
    }

    @FXML
    void handleActionBtn3(ActionEvent event) throws Exception{
        btn1.getStyleClass().remove("btn-quizz--error");
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().add("btn-quizz--success");

        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema2/Nivel2View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws Exception{

        App.setRoot("tema2/Nivel1View");

    }

}
