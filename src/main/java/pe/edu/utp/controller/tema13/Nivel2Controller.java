package pe.edu.utp.controller.tema13;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Nivel;

public class Nivel2Controller {
  @FXML
  private WebView code1;

  @FXML
  private ComboBox<String> nivelSelector;
  private String tema;
  private int nivel;

  @FXML
  void initialize() {
    tema = "tema" + 13;
    nivel = 2;

    Nivel n = new Nivel(tema, nivel);

    n.setNivelItems(nivelSelector, 4);
    code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema13/t13n2_1.html").toExternalForm());
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws Exception {
    App.setRoot("HomeView");
  }

  @FXML
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot(tema + "/Nivel2Quizz1View");
  }

  @FXML
  void handleNivelSelectorClick(ActionEvent event) throws IOException {
    String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
    App.setRoot(tema + "/Nivel" + nivel + "View");
  }

}
