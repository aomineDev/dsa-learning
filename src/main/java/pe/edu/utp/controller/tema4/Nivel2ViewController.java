package pe.edu.utp.controller.tema4;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pe.edu.utp.App;

public class Nivel2ViewController {

    @FXML
    void avanzar(ActionEvent event) throws Exception {
        App.setRoot("tema4/Nivel2Quizz1View");

    }

    @FXML
    void retroceder(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }
}
