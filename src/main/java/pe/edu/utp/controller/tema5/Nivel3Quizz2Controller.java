package pe.edu.utp.controller.tema5;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel3Quizz2Controller {
  @FXML
  private WebView code1;

  @FXML
  void initialize() {
    code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n3q2.html").toExternalForm());
  }

}
