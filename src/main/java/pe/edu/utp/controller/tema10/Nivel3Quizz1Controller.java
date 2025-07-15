package pe.edu.utp.controller.tema10;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel3Quizz1Controller {
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
    tema = "tema" + 10;
    nivel = 3;
    q = 1;

    code.getEngine()
        .load(getClass().getResource("/pe/edu/utp/monaco/" + tema + "/n" + nivel +
            "q" + q + ".html").toExternalForm());
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot(tema + "/Nivel4View");
  }

  @FXML
  void handleOptionBtnClick(ActionEvent event) {
    Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
  }
}
