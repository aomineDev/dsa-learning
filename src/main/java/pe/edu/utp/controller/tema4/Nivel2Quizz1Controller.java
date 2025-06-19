package pe.edu.utp.controller.tema4;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.util.Duration;
import pe.edu.utp.App;

public class Nivel2Quizz1Controller {
 @FXML
    private Button btnconfirmar;

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

        boolean correctosSelccionado = this.rdbtnVGenerarAleatorios.isSelected()
                && this.rdbtnVCalcularPromedio.isSelected();
        boolean incorrectosSeleccionados = !this.rdbtnVInsertar.isSelected() && !this.rdbtnVMostrar.isSelected();
        if (correctosSelccionado && incorrectosSeleccionados) {
            
            this.btnconfirmar.getStyleClass().remove("btn-next");
        this.btnconfirmar.getStyleClass().addAll("btn-quizz--success");

        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema5/Nivel1View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();

        } else {
             this.btnconfirmar.getStyleClass().remove("btn-next");
        this.btnconfirmar.getStyleClass().addAll("btn-quizz--error");
        }

        this.rdbtnVCalcularPromedio.setSelected(false);
        this.rdbtnVGenerarAleatorios.setSelected(false);
        this.rdbtnVInsertar.setSelected(false);
        this.rdbtnVMostrar.setSelected(false);
    }

    @FXML
    void retroceder(ActionEvent event) throws Exception{

        App.setRoot("tema4/Nivel2View");
    }
}
