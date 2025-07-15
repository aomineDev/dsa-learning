package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel3Quizz1Controller {

    @FXML
    private Button correct;

    @FXML
    private Button nextBtn;

    @FXML
    private VBox btnContainer;

    @FXML
    void initialize() {

    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema6/Nivel4CodegroundView");
    }

    @FXML
    void handleOptionBtnClick(ActionEvent event) {
        Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
    }
}
