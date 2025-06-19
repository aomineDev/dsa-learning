package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;

public class Nivel3Quizz3Controller {
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
  private TextField input5;

  @FXML
  private TextField input6;

  @FXML
  private TextField input7;

  @FXML
  private TextField input8;

  @FXML
  private TextField input9;

  @FXML
  private Button nextBtn;

  @FXML
  void handleConfirmBtnClick(ActionEvent event) {
    clearAllBtnStyle();

    int errorCount = 0;

    if (input1.getText().equals("valor")) {
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

    if (input3.getText().equals("null")) {
      input3.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input3.getStyleClass().add("quizz-code--error");
    }

    if (input4.getText().equals("nuevo")) {
      input4.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input4.getStyleClass().add("quizz-code--error");
    }

    if (input5.getText().equals("cabeza")) {
      input5.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input5.getStyleClass().add("quizz-code--error");
    }

    if (input6.getText().equals("while")) {
      input6.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input6.getStyleClass().add("quizz-code--error");
    }

    if (input7.getText().equals("null")) {
      input7.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input7.getStyleClass().add("quizz-code--error");
    }

    if (input8.getText().equals("actual")) {
      input8.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input8.getStyleClass().add("quizz-code--error");
    }

    if (input9.getText().equals("nuevo")) {
      input9.getStyleClass().add("quizz-code--success");
    } else {
      errorCount++;
      input9.getStyleClass().add("quizz-code--error");
    }

    if (errorCount == 0) {
      btnContainer.getChildren().removeFirst();
      nextBtn.setVisible(true);
    }
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) {

  }

  @FXML
  void handleInputTyped(KeyEvent event) {
    TextField textField = (TextField) event.getSource();
    textField.getStyleClass().remove("quizz-code--error");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel4View");

  }

  void clearAllBtnStyle() {
    input1.getStyleClass().remove("quizz-code--success");
    input2.getStyleClass().remove("quizz-code--success");
    input3.getStyleClass().remove("quizz-code--success");
    input4.getStyleClass().remove("quizz-code--success");
    input5.getStyleClass().remove("quizz-code--success");
    input6.getStyleClass().remove("quizz-code--success");
    input7.getStyleClass().remove("quizz-code--success");
    input8.getStyleClass().remove("quizz-code--success");
    input9.getStyleClass().remove("quizz-code--success");
    input1.getStyleClass().remove("quizz-code--error");
    input2.getStyleClass().remove("quizz-code--error");
    input3.getStyleClass().remove("quizz-code--error");
    input4.getStyleClass().remove("quizz-code--error");
    input5.getStyleClass().remove("quizz-code--error");
    input6.getStyleClass().remove("quizz-code--error");
    input7.getStyleClass().remove("quizz-code--error");
    input8.getStyleClass().remove("quizz-code--error");
    input9.getStyleClass().remove("quizz-code--error");
  }
}
