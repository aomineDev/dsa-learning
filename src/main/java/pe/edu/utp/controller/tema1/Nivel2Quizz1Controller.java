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

public class Nivel2Quizz1Controller {

    @FXML
    private Label preguntaLabel;

    @FXML
    private Button opcion1, opcion2, opcion3, btnContinuar;

    private String respuestaCorrecta = "numeros[2] = 45;";

    @FXML
    public void initialize() {
        preguntaLabel.setText("¿Cuál es la forma correcta de actualizar el valor en la posición 2 del arreglo numeros?");
        opcion1.setText("numeros.set(2, 45);");
        opcion2.setText("numeros[2] = 45;");
        opcion3.setText("update(numeros[2], 45);");
        btnContinuar.setDisable(true);
    }

    @FXML
    private void responder(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String seleccion = btn.getText();
        if (seleccion.equals(respuestaCorrecta)) {
            mostrarAlerta("Correcto", "¡Muy bien, el valor ha sido actualizado!");
            btnContinuar.setDisable(false);
        } else {
            mostrarAlerta("Incorrecto", "Revisa la sintaxis para modificar elementos en arreglos.");
        }
    }

    @FXML
    private void irANivel3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/tema1/Nivel3View.fxml"));
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