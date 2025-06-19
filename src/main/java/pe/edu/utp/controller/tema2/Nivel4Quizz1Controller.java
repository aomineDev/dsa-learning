package pe.edu.utp.controller.tema2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pe.edu.utp.App;

public class Nivel4Quizz1Controller {

    @FXML
    void handleActionBtnAtras(ActionEvent event) throws Exception {
        App.setRoot("tema2/Nivel1View");
    }

}