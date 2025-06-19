package pe.edu.utp.controller.tema3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema3/Nivel4View");
    }

    @FXML
    void handleOptionBtnClick(ActionEvent event) {
        clearAllBtns();
        Button btn = (Button) event.getSource();

        if (btn.getId().equals("btn1")) {
            disableAllBtns();
            btn.getStyleClass().add("btn-quizz--success");
            nextBtn.setVisible(true);
        } else {
            btn.getStyleClass().add("btn-quizz--error");
        }
    }

    void clearAllBtns() {
        btn2.getStyleClass().remove("btn-quizz--error");
        btn3.getStyleClass().remove("btn-quizz--error");
    }

    void disableAllBtns() {
        btn2.setDisable(true);
        btn3.setDisable(true);
    }

}
