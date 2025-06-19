package pe.edu.utp.controller.tema3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel2Controller {

    @FXML
    private WebView code1;

    @FXML
    private WebView code2;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema3/Nivel" + nivel + "View");
    }

    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema3/t3n2_1.html").toExternalForm());
        code2.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema3/t3n2_2.html").toExternalForm());
        nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5", "nivel 6", "nivel 7");    
    }

    @FXML
    void handleActionBtn(ActionEvent event) throws IOException{
        App.setRoot("tema3/Nivel2Quizz1View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

}