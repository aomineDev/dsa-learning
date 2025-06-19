package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;

public class Nivel2Quizz2Controller {
  @FXML
  private VBox btnContainer;

  @FXML
  private TextField input1;

  @FXML
  private TextField input2;

  @FXML
  private TextField input3;

  @FXML
  private TextField input4;

  @FXML
  private Button nextBtn;

  @FXML
  void handleConfirmBtnClick(ActionEvent event) {
    clearAllBtnStyle();

    int errorCount = 0;

    if (input1.getText().equals("class")) {
      input1.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input1.getStyleClass().add("quizz-code--error");
    }

    if (input2.getText().equals("Nodo")) {
      input2.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input2.getStyleClass().add("quizz-code--error");
    }

    if (input3.getText().equals("ListaEnlazada")) {
      input3.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input3.getStyleClass().add("quizz-code--error");
    }

    if (input4.getText().equals("cabeza")) {
      input4.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input4.getStyleClass().add("quizz-code--error");
    }

    if (errorCount == 0) {
      btnContainer.getChildren().removeFirst();
      nextBtn.setVisible(true);
    }
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleInputTyped(KeyEvent event) {
    TextField textField = (TextField) event.getSource();
    textField.getStyleClass().remove("quizz-code--error");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel3View");

  }

  void clearAllBtnStyle() {
    input1.getStyleClass().remove("quizz-code--success");
    input2.getStyleClass().remove("quizz-code--success");
    input3.getStyleClass().remove("quizz-code--success");
    input4.getStyleClass().remove("quizz-code--success");

    input1.getStyleClass().remove("quizz-code--error");
    input2.getStyleClass().remove("quizz-code--error");
    input3.getStyleClass().remove("quizz-code--error");
    input4.getStyleClass().remove("quizz-code--error");

  }
}
