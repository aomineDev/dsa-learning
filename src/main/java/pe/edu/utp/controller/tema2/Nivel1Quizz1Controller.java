package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pe.edu.utp.App;

public class Nivel1Quizz1Controller {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button nextBtn;

    @FXML
    void handleActionBtn1(ActionEvent event) throws Exception {
        cleanBtns();
        btn1.getStyleClass().add("btn-quizz--error");
    }

    @FXML
    void handleActionBtn2(ActionEvent event) throws Exception {
        cleanBtns();
        btn2.getStyleClass().add("btn-quizz--error");
    }

    @FXML
    void handleActionBtn3(ActionEvent event) throws Exception {
        cleanBtns();
        btn3.getStyleClass().add("btn-quizz--success");
        disableBtns();
        nextBtn.setVisible(true);
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema2/Nivel2View");
    }

    void cleanBtns() {
        btn1.getStyleClass().remove("btn-quizz--error");
        btn2.getStyleClass().remove("btn-quizz--error");
    }

    void disableBtns() {
        btn1.setDisable(true);
        btn2.setDisable(true);
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws Exception {

        App.setRoot("tema2/Nivel1View");

    }

}
