package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;
import pe.edu.utp.App;

public class Nivel3Quizz1Controller {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button nextBtn;

    @FXML
    void handleActionBtn1(ActionEvent event) throws Exception{
        cleanBtns();
        btn1.getStyleClass().add("btn-quizz--success");
        disableBtns();
        nextBtn.setVisible(true);
    }

    @FXML
    void handleActionBtn2(ActionEvent event) throws Exception{
        cleanBtns();
        btn2.getStyleClass().add("btn-quizz--error");
    }

    @FXML
    void handleActionBtn3(ActionEvent event) throws Exception{
        cleanBtns();
        btn3.getStyleClass().add("btn-quizz--error");
    }

    void cleanBtns() {
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--error");
    }

    void disableBtns() {
        btn2.setDisable(true);
        btn3.setDisable(true);
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema2/Nivel4View");
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

}
