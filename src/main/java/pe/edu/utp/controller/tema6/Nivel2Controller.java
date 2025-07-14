package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel2Controller {

  @FXML
  private WebView Code2;

  @FXML
  private ComboBox<String> nivelSelector;

  private String tema;
  private int nivel;

  @FXML
  void initialize() {
    tema = "tema" + 6;
    nivel = 2;

    Nivel n = new Nivel(tema, nivel);

    n.setCodeView(Code2, 1);

    n.setNivelItems(nivelSelector, 3);
  }

  @FXML
  void handleNivelSelectorClick(ActionEvent event) throws IOException {
    String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
    App.setRoot("tema6/Nivel" + nivel + "View");
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws Exception {
    App.setRoot("HomeView");
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot(tema + "/Nivel2Quizz1View");
  }

}
