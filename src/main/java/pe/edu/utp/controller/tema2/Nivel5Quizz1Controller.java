package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import pe.edu.utp.App;

public class Nivel5Quizz1Controller {

    @FXML
    private WebView code1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button nextBtn;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n5q1_1.html").toExternalForm());
    }

    @FXML
    void handleActionBtn1(ActionEvent event) throws Exception {
        cleanBtns();
        btn1.getStyleClass().add("btn-quizz--success");
        disableBtns();
        nextBtn.setVisible(true);
    }

    @FXML
    void handleActionBtn2(ActionEvent event) throws Exception {
        cleanBtns();
        btn2.getStyleClass().add("btn-quizz--error");
    }

    @FXML
    void handleActionBtn3(ActionEvent event) throws Exception {
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
        App.setRoot("tema2/PuzzleView");
    }

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

}
