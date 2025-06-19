package pe.edu.utp.controller.tema1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class JuegoFinalController {

    @FXML
    private Label preguntaLabel;
    @FXML
    private Button btnVerdadero, btnFalso;

    private String[] preguntas = {
        "¿El recorrido de un arreglo se puede hacer con un bucle for?",
        "¿Se puede insertar en un arreglo en cualquier posición sin desplazar elementos?",
        "¿Copiar un arreglo con '=' crea un nuevo arreglo?"
    };

    private boolean[] respuestas = { true, false, false };
    private int indice = 0;

    @FXML
    public void initialize() {
        mostrarPregunta();
    }

    private void mostrarPregunta() {
        if (indice < preguntas.length) {
            preguntaLabel.setText(preguntas[indice]);
        } else {
            mostrarAlerta("¡Felicidades!", "Has completado el minijuego.");
            btnVerdadero.setDisable(true);
            btnFalso.setDisable(true);
        }
    }

    @FXML
    private void responderVerdadero(ActionEvent event) {
        evaluarRespuesta(true);
    }

    @FXML
    private void responderFalso(ActionEvent event) {
        evaluarRespuesta(false);
    }

    private void evaluarRespuesta(boolean respuesta) {
        if (respuesta == respuestas[indice]) {
            mostrarAlerta("Correcto", "¡Muy bien!");
        } else {
            mostrarAlerta("Incorrecto", "Revisa lo aprendido.");
        }
        indice++;
        mostrarPregunta();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}