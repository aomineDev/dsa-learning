package pe.edu.utp.controller.tema7;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;
import pe.edu.utp.App;

public class Nivel4Controller {

    @FXML
    private WebView code1;

    @FXML
    private ComboBox<String> nivelSelector;

    @FXML
    void handleNivelSelectorClick(ActionEvent event) throws IOException {
        String nivel = nivelSelector.getSelectionModel().getSelectedIndex() + 1 + "";
        App.setRoot("tema7/Nivel" + nivel + "View");
    }
    @FXML
    void initialize() {
        code1.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/tema7/t7n4_1.html").toExternalForm());
        nivelSelector.getItems().addAll("nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5", "nivel 6");    
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws Exception{
        App.setRoot("tema7/Nivel5View");
    }

    @FXML
    void handleGoBackBtnClick(ActionEvent event) throws Exception {
        App.setRoot("HomeView");
    }

}

