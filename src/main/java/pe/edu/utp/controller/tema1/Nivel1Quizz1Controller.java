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

public class Nivel1Quizz1Controller {

    @FXML
    private Label preguntaLabel;

    @FXML
    private Button opcion1, opcion2, opcion3, btnContinuar;

    private String respuestaCorrecta = "25, 2";

    @FXML
    public void initialize() {
        preguntaLabel.setText("¿Qué línea inserta el número 25 en la posición 2 del arreglo numeros?");
        opcion1.setText("30, 2");
        opcion2.setText("2, 25");
        opcion3.setText("25, 2");
        btnContinuar.setDisable(true);
    }

    @FXML
    private void responder(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String seleccion = btn.getText();
        if (seleccion.equals(respuestaCorrecta)) {
            mostrarAlerta("Correcto", "¡Muy bien!");
            btnContinuar.setDisable(false);
        } else {
            mostrarAlerta("Incorrecto", "Vuelve a intentarlo.");
        }
    }

    @FXML
    private void irANivel2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/tema1/Nivel2View.fxml"));
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
