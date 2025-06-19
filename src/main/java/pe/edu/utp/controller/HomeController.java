package pe.edu.utp.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import pe.edu.utp.App;

public class HomeController {
  @FXML
  private Pane unit1;

  @FXML
  private Pane unit2;

  @FXML
  private Button btnLink1;

  @FXML
  private Button btnLink2;

  @FXML
  void HandleBtn1Click(ActionEvent event) throws IOException {
    App.setRoot("tema1/Nivel1View");
  }

  @FXML
  void HandleBtn2Click(ActionEvent event) throws IOException {
    App.setRoot("tema2/Nivel1View");
  }

  @FXML
  void HandleBtn3Click(ActionEvent event) throws IOException {
    App.setRoot("tema3/Nivel1View");
  }

  @FXML
  void HandleBtn4Click(ActionEvent event) throws IOException {
    App.setRoot("tema4/Nivel1View");
  }

  @FXML
  void HandleBtn5Click(ActionEvent event) throws IOException {
    App.setRoot("tema5/Nivel1View");
  }

  @FXML
  void HandleBtn6Click(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel1View");
  }

  @FXML
  void HandleBtn7Click(ActionEvent event) throws IOException {
    App.setRoot("tema7/Nivel1View");
  }

  @FXML
  void hadleUnit1BtnClick(ActionEvent event) {
    unit1.setVisible(true);
    unit2.setVisible(false);
    btnLink1.getStyleClass().add("sidebar__link--active");
    btnLink2.getStyleClass().remove("sidebar__link--active");
  }

  @FXML
  void hadleUnit2BtnClick(ActionEvent event) {
    unit1.setVisible(false);
    unit2.setVisible(true);
    btnLink1.getStyleClass().remove("sidebar__link--active");
    btnLink2.getStyleClass().add("sidebar__link--active");
  }
}
