package pe.edu.utp.controller.tema5;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel4Controller {
  @FXML
  private WebView code1;

  @FXML
  private WebView code2;

  @FXML
  private WebView code3;

  @FXML
  private ComboBox<String> nivelSelector;

  @FXML
  void initialize() {
    code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_1.html").toExternalForm());
    code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_2.html").toExternalForm());
    code3.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema5/t5n4_3.html").toExternalForm());

    nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4");
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel4Quizz1View");
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) {

  }

  @FXML
  void handleNivelSelectorClick(ActionEvent event) throws IOException {
    String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
    App.setRoot("tema5/Nivel" + nivel + "View");
  }

}
