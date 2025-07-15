package pe.edu.utp.controller.tema10;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel4Quizz1Controller {
  private String tema;

  @FXML
  private Button correct;

  @FXML
  private Button nextBtn;

  @FXML
  private VBox btnContainer;

  @FXML
  void initialize() {
    tema = "tema" + 10;
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot(tema + "/Nivel4Quizz2View");
  }

  @FXML
  void handleOptionBtnClick(ActionEvent event) {
    Quizz.handleQUizz1Buttons(event, btnContainer, nextBtn);
  }
}
