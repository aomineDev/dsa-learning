package pe.edu.utp.controller.template;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import pe.edu.utp.App;

public class Quizz2Controller {
  private String[] answers = {};
  private int index = 0;
  private int errorCount = 0;

  @FXML
  private VBox btnContainer;

  @FXML
  private VBox code;

  @FXML
  private Button nextBtn;

  @FXML
  private TextFlow result;

  @FXML
  void handleConfirmBtnClick(ActionEvent event) {
    code.getChildren().forEach(node -> {
      HBox line = (HBox) node;

      line.getChildren().forEach(subnode -> {
        if (!(subnode instanceof TextField))
          return;

        TextField input = (TextField) subnode;

        if (input.getText().equals(answers[index++]))
          input.getStyleClass().add("quizz-code--success");
        else {
          errorCount++;
          input.getStyleClass().add("quizz-code--error");
        }
      });
    });

    if (errorCount == 0) {
      btnContainer.getChildren().removeFirst();
      nextBtn.setVisible(true);
      result.setVisible(true);
    }
  }

  @FXML
  void handleNextBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleInputTyped(KeyEvent event) {
    TextField textField = (TextField) event.getSource();
    textField.getStyleClass().remove("quizz-code--error");
    textField.getStyleClass().remove("quizz-code--success");
  }
}
