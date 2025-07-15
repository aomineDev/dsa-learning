package pe.edu.utp.controller.tema4;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import pe.edu.utp.App;

public class QuizzFinalController {
  private int points;
  @FXML
  private TextField answer1;

  @FXML
  private TextField answer2;

  @FXML
  private Button correct;

  @FXML
  private VBox btnContainer;

  @FXML
  private StackPane modal;

  @FXML
  private WebView code;

  @FXML
  void initialize() {
    code.getEngine()
        .load(getClass().getResource("/pe/edu/utp/html/tema4/qf.html").toExternalForm());
  }

  @FXML
  void handleAnswer1KeyTyped(KeyEvent event) {
    validTextField(answer1, "nodo");
  }

  @FXML
  void handleAnswer2KeyTyped(KeyEvent event) {
    validTextField(answer2, "puntero");
  }

  @FXML
  void handleBtnClick(ActionEvent event) {
    clearBtnClass();

    Button btn = (Button) event.getSource();

    if (btn.getId() != null) {
      btn.getStyleClass().add("reto-btn--success");
      disableAllBtns();
      points++;
      handleWin();
    } else {
      btn.getStyleClass().add("reto-btn--error");
    }
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  void validTextField(TextField textField, String answer) {
    if (textField.getText().equals(answer)) {
      textField.getStyleClass().add("reto-text-field--success");
      textField.setEditable(false);
      points++;
      handleWin();
    }
  }

  void clearBtnClass() {
    btnContainer.getChildren().forEach(node -> {
      node.getStyleClass().remove("reto-btn--error");
    });
  }

  void disableAllBtns() {
    btnContainer.getChildren().forEach(node -> {
      node.setDisable(true);
    });
  }

  void handleWin() {
    if (points == 3) {
      openModal();
    }
  }

  public void openModal() {
    modal.setVisible(true);
    FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), modal);
    fadeIn.setFromValue(0);
    fadeIn.setToValue(1);
    fadeIn.play();
  }
}
