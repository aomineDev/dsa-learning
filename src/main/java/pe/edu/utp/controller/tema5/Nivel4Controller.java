package pe.edu.utp.controller.tema5;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class Nivel4Controller {
  @FXML
  private WebView code1;

  @FXML
  private WebView code2;

  @FXML
  private WebView code3;

  @FXML
  void initialize() {
    code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_1.html").toExternalForm());
    code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_2.html").toExternalForm());
    code3.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_3.html").toExternalForm());
  }
}
