package pe.edu.utp.controller.template;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.codehaus.janino.SimpleCompiler;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import netscape.javascript.JSObject;
import pe.edu.utp.App;
import pe.edu.utp.util.Codeground;

public class CodegroundController {
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

    int tema = 0;
    // code.getEngine()
    // .load(getClass().getResource("/pe/edu/utp/monaco/tema" + tema +
    // "/codeground.html").toExternalForm());
    code.getEngine()
        .load(getClass().getResource("/pe/edu/utp/monaco/template/codeground.html").toExternalForm());
  }

  @FXML
  void handleCloseModalClick(MouseEvent event) {
    Codeground.closeModal(modal);
  }

  @FXML
  void handleExceuteClick(ActionEvent event) {
    int errorCount = 0;

    JSObject jsWindow = (JSObject) code.getEngine().executeScript("window");
    String code = (String) jsWindow.call("getCode");

    ByteArrayOutputStream outputCatched = new ByteArrayOutputStream();
    PrintStream original = System.out;
    System.setOut(new PrintStream(outputCatched));

    SimpleCompiler compiler = new SimpleCompiler();

    try {
      compiler.cook(code);

      Class<?> clazz = compiler.getClassLoader().loadClass("Ejercicio");

      Method method = clazz.getMethod("solucion", Integer.class);
      Object objResult1 = method.invoke(null, 5);
      resultCase1.setText(objResult1.toString());

      if (objResult1 instanceof Integer) {
        if ((Integer) objResult1 == 6) {
          btnCase1.getStyleClass().remove("test-btn--error");

          if (!btnCase1.getStyleClass().contains("test-btn--success"))
            btnCase1.getStyleClass().add("test-btn--success");
        } else {
          btnCase1.getStyleClass().remove("test-btn--success");

          if (!btnCase1.getStyleClass().contains("test-btn--error"))
            btnCase1.getStyleClass().add("test-btn--error");

          errorCount++;
        }
      }

      String out = outputCatched.toString().trim();
      outputText1.getStyleClass().remove("console-output__content--error");
      outputText1.setText(out);

      ByteArrayOutputStream outputCatched2 = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outputCatched2));

      Object objResult2 = method.invoke(null, 8);
      resultCase2.setText(objResult2.toString());

      if (objResult2 instanceof Integer) {
        if ((Integer) objResult2 == 9) {
          btnCase2.getStyleClass().remove("test-btn--error");

          if (!btnCase2.getStyleClass().contains("test-btn--success"))
            btnCase2.getStyleClass().add("test-btn--success");
        } else {
          btnCase2.getStyleClass().remove("test-btn--success");

          if (!btnCase2.getStyleClass().contains("test-btn--error"))
            btnCase2.getStyleClass().add("test-btn--error");

          errorCount++;
        }
      }

      String out2 = outputCatched2.toString().trim();
      outputText2.getStyleClass().remove("console-output__content--error");
      outputText2.setText(out2);

      if (errorCount == 0)
        Codeground.openModal(modal);

    } catch (Exception e) {
      resultCase1.setText("--");
      resultCase2.setText("--");

      if (!btnCase1.getStyleClass().contains("test-btn--error"))
        btnCase1.getStyleClass().add("test-btn--error");

      if (!btnCase2.getStyleClass().contains("test-btn--error"))
        btnCase2.getStyleClass().add("test-btn--error");

      if (!outputText1.getStyleClass().contains("console-output__content--error"))
        outputText1.getStyleClass().add("console-output__content--error");

      outputText1.setText("Error:\n" + e.getMessage());

      if (!outputText2.getStyleClass().contains("console-output__content--error"))
        outputText2.getStyleClass().add("console-output__content--error");

      outputText2.setText("Error:\n" + e.getMessage());
    }

    System.setOut(original);
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
  void handleContinueBtnClick(ActionEvent event) throws IOException {
    App.setRoot("");
  }
}
