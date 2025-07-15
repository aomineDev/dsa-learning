package pe.edu.utp.controller.tema2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel2Quizz1Controller {

    @FXML
    private WebView code1;

    @FXML
    private Button correct;

    @FXML
    private Button nextBtn;

    @FXML
    private VBox btnContainer;

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema2/t2n2q1_1.html").toExternalForm());
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    void handleNextBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema2/Nivel3View");
    }

    @FXML
    void handleOptionBtnClick(ActionEvent event) {
        Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
    }

}
