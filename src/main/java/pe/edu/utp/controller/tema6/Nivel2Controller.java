package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel2Controller {

    @FXML
  private WebView Code2;

  @FXML
  void initialize() {
    Code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema6/t6n2_1.html").toExternalForm());
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel2Quizz1View");
  }
  @FXML
    void handleTAnteriorBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel1Quizz1View");
    }
}
