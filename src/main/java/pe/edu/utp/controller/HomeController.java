package pe.edu.utp.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import pe.edu.utp.App;

public class HomeController {
  @FXML
  private Button btnLink1;

  @FXML
  private Button btnLink2;

  @FXML
  private Button btnLink3;

  @FXML
  private Button btnLink4;

  @FXML
  private VBox unit1;

  @FXML
  private VBox unit2;

  @FXML
  private VBox unit3;

  @FXML
  private VBox unit4;

  @FXML
  void HandleBtn1Click(ActionEvent event) throws IOException {
    setRoot(1);
  }

  @FXML
  void HandleBtn2Click(ActionEvent event) throws IOException {
    setRoot(2);
  }

  @FXML
  void HandleBtn3Click(ActionEvent event) throws IOException {
    setRoot(3);
  }

  @FXML
  void HandleBtn4Click(ActionEvent event) throws IOException {
    setRoot(4);
  }

  @FXML
  void HandleBtn5Click(ActionEvent event) throws IOException {
    setRoot(5);
  }

  @FXML
  void HandleBtn6Click(ActionEvent event) throws IOException {
    setRoot(6);
  }

  @FXML
  void HandleBtn7Click(ActionEvent event) throws IOException {
    setRoot(7);
  }

  @FXML
  void HandleBtn8Click(ActionEvent event) throws IOException {
    setRoot(8);
  }

  @FXML
  void HandleBtn9Click(ActionEvent event) throws IOException {
    setRoot(9);
  }

  @FXML
  void HandleBtn10Click(ActionEvent event) throws IOException {
    setRoot(10);
  }

  @FXML
  void HandleBtn11Click(ActionEvent event) throws IOException {
    setRoot(11);
  }

  @FXML
  void HandleBtn12Click(ActionEvent event) throws IOException {
    setRoot(12);
  }

  @FXML
  void HandleBtn13Click(ActionEvent event) throws IOException {
    setRoot(13);
  }

  @FXML
  void hadleUnitBtnClick(ActionEvent event) {
    Button btn = (Button) event.getSource();
    String id = btn.getId();

    clearAllUnits();

    clearAllBtnStyle();

    if (id.equals("btnLink1")) {
      unit1.setVisible(true);
      btnLink1.getStyleClass().add("sidebar__link--active");
    } else if (id.equals("btnLink2")) {
      unit2.setVisible(true);
      btnLink2.getStyleClass().add("sidebar__link--active");
    } else if (id.equals("btnLink3")) {
      unit3.setVisible(true);
      btnLink3.getStyleClass().add("sidebar__link--active");
    } else if (id.equals("btnLink4")) {
      unit4.setVisible(true);
      btnLink4.getStyleClass().add("sidebar__link--active");
    }
  }

  void clearAllUnits() {
    unit1.setVisible(false);
    unit2.setVisible(false);
    unit3.setVisible(false);
    unit4.setVisible(false);
  }

  void clearAllBtnStyle() {
    btnLink1.getStyleClass().remove("sidebar__link--active");
    btnLink2.getStyleClass().remove("sidebar__link--active");
    btnLink3.getStyleClass().remove("sidebar__link--active");
    btnLink4.getStyleClass().remove("sidebar__link--active");
  }

  void setRoot(int subject) throws IOException {
    App.setRoot("tema" + subject + "/Nivel1View");
  }
}
