package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pe.edu.utp.App;

public class Nivel4Quizz1Controller {
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
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel4Quizz2View");
  }

  @FXML
  void handleOptionBtnClick(ActionEvent event) {
    clearAllBtns();
    Button btn = (Button) event.getSource();

    if (btn.getId().equals("btn2")) {
      disableAllBtns();
      btn.getStyleClass().add("btn-quizz--success");
      nextBtn.setVisible(true);
    } else {
      btn.getStyleClass().add("btn-quizz--error");
    }
  }

  void clearAllBtns() {
    btn1.getStyleClass().remove("btn-quizz--error");
    btn3.getStyleClass().remove("btn-quizz--error");
    btn4.getStyleClass().remove("btn-quizz--error");
  }

  void disableAllBtns() {
    btn1.setDisable(true);
    btn3.setDisable(true);
    btn4.setDisable(true);
  }
}
