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
    private VBox btnContainer;

    @FXML
    private Button correct;

    @FXML
    private Button nextBtn;

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema3/Nivel3View");
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema7/Nivel1View");
    }

    @FXML
    void handleOptionBtnClick(ActionEvent event) {
        Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
    }

}