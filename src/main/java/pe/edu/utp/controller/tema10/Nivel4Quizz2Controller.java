package pe.edu.utp.controller.tema10;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;
import pe.edu.utp.util.Quizz;

public class Nivel4Quizz2Controller {
  private String[] answers = { "nodo", "null", "postorden", "derecho", "nodo" };

  @FXML
  private VBox btnContainer;

  @FXML
  private VBox code;

  @FXML
  private Button nextBtn;

  @FXML
  void handleConfirmBtnClick(ActionEvent event) {
    boolean correct = Quizz.handleQuizzInputs(code, answers);

    if (correct) {
      btnContainer.getChildren().removeFirst();
      nextBtn.setVisible(true);
    }
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema10/CodegroundView");
  }

  @FXML
  void handleInputTyped(KeyEvent event) {
    TextField textField = (TextField) event.getSource();
    textField.getStyleClass().remove("quizz-code--error");
    textField.getStyleClass().remove("quizz-code--success");
  }
}
