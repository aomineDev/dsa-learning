package pe.edu.utp.controller.tema1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class Nivel4Quizz1Controller {

    @FXML
    private Label preguntaLabel;

    @FXML
    private Button opcion1, opcion2, opcion3, btnContinuar;

    private String respuestaCorrecta = "for (int i = 0; i < numeros.length; i++)";

    @FXML
    public void initialize() {
        preguntaLabel.setText("¿Cuál es la forma correcta de recorrer todos los elementos de un arreglo?");
        opcion1.setText("for each numero in numeros");
        opcion2.setText("for (int i = 0; i < numeros.length; i++)");
        opcion3.setText("foreach numeros as numero");
        btnContinuar.setDisable(true);
    }

    @FXML
    private void responder(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String seleccion = btn.getText();
        if (seleccion.equals(respuestaCorrecta)) {
            mostrarAlerta("Correcto", "¡Recorrido exitoso!");
            btnContinuar.setDisable(false);
        } else {
            mostrarAlerta("Incorrecto", "Revisa la sintaxis de un bucle for clásico en Java.");
        }
    }

    @FXML
    private void irANivel5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/tema1/Nivel5View.fxml"));
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}