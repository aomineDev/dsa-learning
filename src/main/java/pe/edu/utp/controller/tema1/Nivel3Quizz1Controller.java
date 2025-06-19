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

public class Nivel3Quizz1Controller {

    @FXML
    private Label preguntaLabel;

    @FXML
    private Button opcion1, opcion2, opcion3, btnContinuar;

    private String respuestaCorrecta = "numeros.remove(2)";

    @FXML
    public void initialize() {
        preguntaLabel.setText("¿Cuál es la forma correcta de eliminar el elemento en la posición 2 del arreglo numeros?");
        opcion1.setText("numeros[2] = 0");
        opcion2.setText("numeros.remove(2)");
        opcion3.setText("delete numeros[2]");
        btnContinuar.setDisable(true);
    }

    @FXML
    private void responder(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String seleccion = btn.getText();
        if (seleccion.equals(respuestaCorrecta)) {
            mostrarAlerta("Correcto", "¡Buena elección!");
            btnContinuar.setDisable(false);
        } else {
            mostrarAlerta("Incorrecto", "Recuerda cómo se elimina en Java una posición de un ArrayList.");
        }
    }

    @FXML
    private void irANivel4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/tema1/Nivel4View.fxml"));
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