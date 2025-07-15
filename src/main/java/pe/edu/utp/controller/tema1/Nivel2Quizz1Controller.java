package pe.edu.utp.controller.tema1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel2Quizz1Controller {
  private String tema;
  private int nivel;
  private int q;

  @FXML
  private Button correct;

  @FXML
  private Button nextBtn;

  @FXML
  private VBox btnContainer;

  @FXML
  private WebView code;

  @FXML
  void initialize() {
    tema = "tema" + 1;

    nivel = 2;
    q = 1;

    code.getEngine()
        .load(getClass().getResource("/pe/edu/utp/monaco/" + tema + "/n" + nivel + "q" + q + ".html").toExternalForm());
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot(tema + "/Nivel3View");
  }

  @FXML
  void handleOptionBtnClick(ActionEvent event) {
    Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
  }
}
