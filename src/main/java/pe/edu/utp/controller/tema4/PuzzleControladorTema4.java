package pe.edu.utp.controller.tema4;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import pe.edu.utp.App;

public class PuzzleControladorTema4 {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;

    @FXML
    private ImageView idcarro;

    @FXML
    private TextField txtfield1;
    @FXML
    private TextField txtfield2;

    private final double DISTANCIA_AVANCE_TF = 50.0;
    private final double POSICION_META_FINAL_Y = 100.0;

    private boolean txtfield1Movido = false;
    private boolean txtfield2Movido = false;

    @FXML
    public void initialize() {

        // --- TextField 1: nodos ---
        txtfield1.textProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.trim().equalsIgnoreCase("nodos") && !txtfield1Movido) {
                moverCarro(DISTANCIA_AVANCE_TF);
                txtfield1Movido = true;
                mostrarAlerta("✅ ¡Correcto! Avanzaste por escribir 'nodos'.");
            }
        });

        txtfield1.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER && txtfield1.getText().trim().equalsIgnoreCase("nodos")
                    && !txtfield1Movido) {
                moverCarro(DISTANCIA_AVANCE_TF);
                txtfield1Movido = true;
                mostrarAlerta(" ¡Correcto! Avanzaste por escribir 'nodos'.");
            }
        });

        // --- TextField 2: punteros ---
        txtfield2.textProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.trim().equalsIgnoreCase("puntero") && !txtfield2Movido) {
                moverCarro(DISTANCIA_AVANCE_TF);
                txtfield2Movido = true;
                mostrarAlerta("¡Bien hecho! Avanzaste por escribir 'puntero'.");
            }
        });

        txtfield2.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER && txtfield2.getText().trim().equalsIgnoreCase("punteros")
                    && !txtfield2Movido) {
                moverCarro(DISTANCIA_AVANCE_TF);
                txtfield2Movido = true;
                mostrarAlerta("¡Bien hecho! Avanzaste por escribir 'puntero'.");
            }
        });

    }

    @FXML
    public void handleBtn3Click(ActionEvent event) throws IOException {
        idcarro.setLayoutY(POSICION_META_FINAL_Y);
        mostrarAlerta("🏁 ¡Felicidades! Has llegado a la meta.");
        App.setRoot("HomeView");
    }

    private void moverCarro(double distancia) {
        double actualY = idcarro.getLayoutY();
        double nuevoY = actualY - distancia;
        idcarro.setLayoutY(nuevoY);
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}