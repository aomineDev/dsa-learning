package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pe.edu.utp.App;

public class Nivel2Quizz1Controller {
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    void btnRegresar(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel2View");
    }

    @FXML
    void hundleActionbtn1(ActionEvent event) {
         btn1.getStyleClass().add("btn-quizz--error");
         btn2.getStyleClass().remove("btn-quizz--success");
         btn3.getStyleClass().remove("btn-quizz--error");
         btn4.getStyleClass().remove("btn-quizz--error");
    }

    @FXML
    void hundleActionbtn2(ActionEvent event) {
        btn1.getStyleClass().remove("btn-quizz--error");
         btn2.getStyleClass().add("btn-quizz--success");
         btn3.getStyleClass().remove("btn-quizz-error");
         btn4.getStyleClass().remove("btn-quizz--error");
         PauseTransition delay = new PauseTransition(javafx.util.Duration.seconds(3));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema6/Nivel3View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();
    }

    @FXML
    void hundleActionbtn3(ActionEvent event) {
        btn1.getStyleClass().remove("btn-quizz--error");
         btn2.getStyleClass().remove("btn-quizz--success");
         btn3.getStyleClass().add("btn-quizz--error");
         btn4.getStyleClass().remove("btn-quizz--error");
    }

    @FXML
    void hundleActionbtn4(ActionEvent event) {
        btn1.getStyleClass().remove("btn-quizz--error");
         btn2.getStyleClass().remove("btn-quizz--success");
         btn3.getStyleClass().remove("btn-quizz--error");
         btn4.getStyleClass().add("btn-quizz--error");
    }
}
