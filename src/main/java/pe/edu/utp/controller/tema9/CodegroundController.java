package pe.edu.utp.controller.tema9;

import java.io.IOException;
import java.io.PrintStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebView;
import pe.edu.utp.App;
import pe.edu.utp.util.Codeground;

public class CodegroundController {

    private Codeground codeground;
    private Object[][] testCase1 = { { 4, 2 }, { 1 } };
    private Object[][] testCase2 = { { 7, 3 }, { 4 } };

    @FXML
    private Button btnCase1;

    @FXML
    private Button btnCase2;

    @FXML
    private VBox case1;

    @FXML
    private VBox case2;

    @FXML
    private WebView code;

    @FXML
    private TextFlow output1;

    @FXML
    private TextFlow output2;

    @FXML
    private Text outputText1;

    @FXML
    private Text outputText2;

    @FXML
    private StackPane modal;

    @FXML
    private Text resultCase1;

    @FXML
    private Text resultCase2;

    @FXML
    void initialize() {
        int tema = 9;
        codeground = new Codeground(new Class[] { Integer.class, Integer.class });

        code.getEngine()
                .load(getClass().getResource("/pe/edu/utp/monaco/tema" + tema + "/codeground.html").toExternalForm());
    }

    @FXML
    void handleContinueBtnClick(ActionEvent event) throws IOException {
        App.setRoot("tema10/Nivel1View");
    }

    @FXML
    void handleExceuteClick(ActionEvent event) {
        PrintStream originalOut = System.out;

        try {
            codeground.compile(code);

            codeground.testCase(testCase1[0], testCase1[1][0]);
            codeground.renderResult(resultCase1, outputText1, btnCase1);

            codeground.testCase(testCase2[0], testCase2[1][0]);
            codeground.renderResult(resultCase2, outputText2, btnCase2);

            if (codeground.isValid())
                Codeground.openModal(modal);

        } catch (Exception e) {
            codeground.handleCodeError(e);
            codeground.renderResult(resultCase1, outputText1, btnCase1);
            codeground.renderResult(resultCase2, outputText2, btnCase2);
        }

        System.setOut(originalOut);
    }

    @FXML
    void handleBtnCase1Click(ActionEvent event) {
        case1.setVisible(true);
        case2.setVisible(false);
        output1.setVisible(true);
        output2.setVisible(false);
    }

    @FXML
    void handleBtnCase2Click(ActionEvent event) {
        case1.setVisible(false);
        case2.setVisible(true);
        output1.setVisible(false);
        output2.setVisible(true);
    }

    @FXML
    void handleCloseModalClick(MouseEvent event) {
        Codeground.closeModal(modal);
    }
}
