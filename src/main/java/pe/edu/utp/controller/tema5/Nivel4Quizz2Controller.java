package pe.edu.utp.controller.tema5;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel4Quizz2Controller {
  @FXML
  private WebView code;

  @FXML
  void initialize() {
    code.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4q2.html").toExternalForm());
  }
}
