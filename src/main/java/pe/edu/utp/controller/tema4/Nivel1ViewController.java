package pe.edu.utp.controller.tema4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pe.edu.utp.App;

public class Nivel1ViewController {
    @FXML
    void avanzar(ActionEvent event) throws Exception {

        App.setRoot("tema4/Nivel1Quizz1View");
    }

    @FXML
    void retroceder(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }
}
