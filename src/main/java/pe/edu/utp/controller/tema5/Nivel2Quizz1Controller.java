package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pe.edu.utp.App;

public class Nivel2Quizz1Controller {
  @FXML
  private Button btn1;

  @FXML
  private Button btn2;

  @FXML
  private Button btn3;

  @FXML
  private Button btn4;

  @FXML
  private Button nextBtn;

  @FXML
  void handleBtn1Click(ActionEvent event) {
    cleanBtns();
    btn1.getStyleClass().add("btn-quizz--error");
  }

  @FXML
  void handleBtn2Click(ActionEvent event) {
    cleanBtns();
    btn2.getStyleClass().add("btn-quizz--success");
    disableBtns();
    nextBtn.setVisible(true);
  }

  @FXML
  void handleBtn3Click(ActionEvent event) {
    cleanBtns();
    btn3.getStyleClass().add("btn-quizz--error");
  }

  @FXML
  void handleBtn4Click(ActionEvent event) {
    cleanBtns();
    btn4.getStyleClass().add("btn-quizz--error");
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel1View");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel2Quizz2View");
  }

  void cleanBtns() {
    btn1.getStyleClass().remove("btn-quizz--error");
    btn3.getStyleClass().remove("btn-quizz--error");
    btn4.getStyleClass().remove("btn-quizz--error");
  }

  void disableBtns() {
    btn1.setDisable(true);
    btn3.setDisable(true);
    btn4.setDisable(true);
  }
}
