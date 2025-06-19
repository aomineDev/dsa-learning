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
    public void initialize() {
        agregarListenersCambio();
    }

    private void agregarListenersCambio() {
        rdbtnVCalcularPromedio.setOnAction(e -> resetearEstiloBoton());
        rdbtnVGenerarAleatorios.setOnAction(e -> resetearEstiloBoton());
        rdbtnVInsertar.setOnAction(e -> resetearEstiloBoton());
        rdbtnVMostrar.setOnAction(e -> resetearEstiloBoton());
    }

    private void resetearEstiloBoton() {
        if (!btnconfirmar.getStyleClass().contains("btn-next")) {
            btnconfirmar.getStyleClass().removeAll("btn-quizz--error", "btn-quizz--success");
            btnconfirmar.getStyleClass().add("btn-next");
        }
    }

    @FXML
    void confirmar(ActionEvent event) {
        boolean correctosSelccionado = this.rdbtnVGenerarAleatorios.isSelected()
                && this.rdbtnVCalcularPromedio.isSelected();
        boolean incorrectosSeleccionados = !this.rdbtnVInsertar.isSelected()
                && !this.rdbtnVMostrar.isSelected();

        if (correctosSelccionado && incorrectosSeleccionados) {
            this.btnconfirmar.getStyleClass().remove("btn-next");
            this.btnconfirmar.getStyleClass().addAll("btn-quizz--success");

            PauseTransition delay = new PauseTransition(Duration.seconds(3));
            delay.setOnFinished(e -> {
                try {
                    App.setRoot("tema4/PuzzleTema4");
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
    void retroceder(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }
}
