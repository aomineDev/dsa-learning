package pe.edu.utp.controller.tema11;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;
import pe.edu.utp.util.Quizz;

public class Nivel4Quizz2Controller {
    private String tema;
    private int nivel;
    @FXML
    private VBox btnContainer;

    @FXML
    private WebView code;

    @FXML
    private Button correct;

    @FXML
    private Button nextBtn;

    @FXML
    void initialize() {
        tema = "tema" + 11;
        nivel = 4;

        Nivel n = new Nivel(tema, nivel);

        n.setCodeView(code, 4);

    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema12/Nivel1View");
    }

    @FXML
    void handleOptionBtnClick(ActionEvent event) {
        Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
    }
}
