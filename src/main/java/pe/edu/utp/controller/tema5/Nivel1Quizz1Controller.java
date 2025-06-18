package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pe.edu.utp.App;

public class Nivel1Quizz1Controller {
  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel1View");
  }
}
