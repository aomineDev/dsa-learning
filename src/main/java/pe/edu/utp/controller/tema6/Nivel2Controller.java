package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel2Controller {

  @FXML
  private WebView Code2;

  @FXML
  void initialize() {
    Code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema6/t6n2_1.html").toExternalForm());
    idselector.getItems().addAll("nivel 1", "nivel 2", "nivel 3");

  }

  @FXML
  private ComboBox<String> idselector;

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel2Quizz1View");
  }

  @FXML
  void handleTAnteriorBtnClick(ActionEvent event) throws IOException {
    App.setRoot("HomeView");
  }

  @FXML
  void handleNivelSelectorClick(ActionEvent event) throws Exception {
    String nivel = idselector.getSelectionModel().getSelectedIndex() + 1 + "";
    App.setRoot("tema6/Nivel" + nivel + "View");
  }
}
