package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel1Controller {
  @FXML
  private WebView code1;

  @FXML
  private WebView code2;

  @FXML
  void initialize() {
    code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n1_1.html").toExternalForm());
    code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n1_2.html").toExternalForm());
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel1Quizz1View");
  }
}
