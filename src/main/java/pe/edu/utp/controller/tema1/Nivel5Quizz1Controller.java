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

public class Nivel5Quizz1Controller {

    @FXML
    private Label preguntaLabel;

    @FXML
    private Button opcion1, opcion2, opcion3, btnFinalizar;

    private String respuestaCorrecta = "int[] copia = Arrays.copyOf(original, original.length);";

    @FXML
    public void initialize() {
        preguntaLabel.setText("¿Cuál es la forma correcta de copiar un arreglo en Java?");
        opcion1.setText("int[] copia = original;");
        opcion2.setText("int[] copia = Arrays.copyOf(original, original.length);");
        opcion3.setText("copy(original, copia);");
        btnFinalizar.setDisable(true);
    }

    @FXML
    private void responder(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String seleccion = btn.getText();
        if (seleccion.equals(respuestaCorrecta)) {
            mostrarAlerta("Correcto", "¡Buen trabajo! Has completado el tema.");
            btnFinalizar.setDisable(false);
        } else {
            mostrarAlerta("Incorrecto", "Revisa cómo se usa Arrays.copyOf en Java.");
        }
    }

    @FXML
    private void irAlJuegoFinal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/juego/JuegoFinalView.fxml"));
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