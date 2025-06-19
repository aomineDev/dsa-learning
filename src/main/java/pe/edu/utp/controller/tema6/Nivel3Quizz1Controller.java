package pe.edu.utp.controller.tema6;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pe.edu.utp.App;

public class Nivel3Quizz1Controller {

    @FXML
    private Button Regresar;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Button boton4;

    @FXML
    void btnRegresar(ActionEvent event) throws IOException {
    App.setRoot("tema6/Nivel3View");
    }

    @FXML
    void hundleActionboton1(ActionEvent event) {
        boton1.getStyleClass().add("btn-quizz--error");
        boton2.getStyleClass().remove("btn-quizz--error");
        boton3.getStyleClass().remove("btn-quizz--success");
        boton4.getStyleClass().remove("btn-quizz--error");
    }

    @FXML
    void hundleActionboton2(ActionEvent event) {
        boton1.getStyleClass().remove("btn-quizz--error");
        boton2.getStyleClass().add("btn-quizz--error");
        boton3.getStyleClass().remove("btn-quizz--success");
        boton4.getStyleClass().remove("btn-quizz--error");
    }

    @FXML
    void hundleActionboton3(ActionEvent event) {
        boton1.getStyleClass().remove("btn-quizz--error");
        boton2.getStyleClass().remove("btn-quizz--error");
        boton3.getStyleClass().add("btn-quizz--success");
        boton4.getStyleClass().remove("btn-quizz--error");
        PauseTransition delay = new PauseTransition(javafx.util.Duration.seconds(3));
        delay.setOnFinished(e -> {
            try {
             App.setRoot("tema7/Nivel1View");  
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        delay.play();
    }

    @FXML
    void hundleActionboton4(ActionEvent event) {
        boton1.getStyleClass().remove("btn-quizz--error");
        boton2.getStyleClass().remove("btn-quizz--error");
        boton3.getStyleClass().remove("btn-quizz--success");
        boton4.getStyleClass().add("btn-quizz--error");
    }


    public void initialize() {
        // Hint: initialize() will be called when the associated FXML has been completely loaded.
    }
}
