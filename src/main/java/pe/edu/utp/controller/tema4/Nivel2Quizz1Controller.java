package pe.edu.utp.controller.tema4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;

public class Nivel2Quizz1Controller {

    @FXML
    private RadioButton rdbtnVCalcularPromedio;

    @FXML
    private RadioButton rdbtnVGenerarAleatorios;

    @FXML
    private RadioButton rdbtnVInsertar;

    @FXML
    private RadioButton rdbtnVMostrar;

    @FXML
    void confirmar(ActionEvent event) {

        boolean correctosSelccionado = this.rdbtnVGenerarAleatorios.isSelected() && this.rdbtnVCalcularPromedio.isSelected();
      boolean incorrectosSeleccionados = !this.rdbtnVInsertar.isSelected() && !this.rdbtnVMostrar.isSelected();
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
