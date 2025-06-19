package pe.edu.utp.controller.tema4;

import javafx.util.Duration;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import pe.edu.utp.App;

public class Nivel1Quizz1Controller {
    @FXML
    private RadioButton rdbtnArrays;

    @FXML
    private RadioButton rdbtnColas;

    @FXML
    private RadioButton rdbtnListasEnlazadas;

    @FXML
    private RadioButton rdbtnPilas;

    @FXML
    private RadioButton rdbtnString;

    @FXML
    private Button btnconfirmar;

    @FXML
   void guardar(ActionEvent event)  {

    boolean correctosSeleccionados = this.rdbtnColas.isSelected()
            && this.rdbtnPilas.isSelected()
            && this.rdbtnListasEnlazadas.isSelected();

    boolean incorrectosSeleccionados = !this.rdbtnString.isSelected()
            && !this.rdbtnArrays.isSelected();

    if (correctosSeleccionados && incorrectosSeleccionados) {

        this.btnconfirmar.getStyleClass().remove("btn-next");
        this.btnconfirmar.getStyleClass().addAll("btn-quizz--success");

        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema4/Nivel2View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();

    } else {

        this.btnconfirmar.getStyleClass().remove("btn-next");
        this.btnconfirmar.getStyleClass().addAll("btn-quizz--error");
    }

    // Deseleccionar después, si quieres que siempre se limpien
    this.rdbtnArrays.setSelected(false);
    this.rdbtnColas.setSelected(false);
    this.rdbtnListasEnlazadas.setSelected(false);
    this.rdbtnPilas.setSelected(false);
    this.rdbtnString.setSelected(false);
}

    @FXML
    void retroceder(ActionEvent event) throws Exception {
        App.setRoot("tema4/Nivel1View");

    }

    @FXML
    void avanzar(ActionEvent event) {

    }

}
