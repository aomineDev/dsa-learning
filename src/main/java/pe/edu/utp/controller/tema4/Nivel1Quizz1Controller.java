package pe.edu.utp.controller.tema4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;

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
    void guardar(ActionEvent event) {

        boolean correctosSelccionado = this.rdbtnColas.isSelected() && this.rdbtnPilas.isSelected()
                && this.rdbtnListasEnlazadas.isSelected();
        boolean incorrectosSeleccionados = !this.rdbtnString.isSelected() && !this.rdbtnArrays.isSelected();
        if (correctosSelccionado && incorrectosSeleccionados) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mensaje");
            alert.setHeaderText(null);
            alert.setContentText("¡Excelente!");
            alert.showAndWait();
    
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Mensaje");
            alert.setHeaderText(null);
            alert.setContentText("Error");
            alert.showAndWait();
        }

    }

    @FXML
    void retroceder(ActionEvent event) {

    }
}
