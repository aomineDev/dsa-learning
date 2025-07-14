package pe.edu.utp.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.codehaus.janino.SimpleCompiler;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import netscape.javascript.JSObject;

public class Codeground {
  private Method method;
  private int errorCount;
  private Class<?>[] clazz;
  private String testCaseOutput;
  private boolean testCaseResult;
  private String testCaseSystemOutput;
  private boolean hasError;

  public Codeground(Class<?>[] clazz) {
    this.clazz = clazz;
  }

  public void compile(WebView codeView) throws Exception {
    errorCount = 0;
    hasError = false;

    JSObject jsWindow = (JSObject) codeView.getEngine().executeScript("window");

    SimpleCompiler compiler = new SimpleCompiler();

    String code = (String) jsWindow.call("getCode");
    compiler.cook(code);

    Class<?> ejercicio = compiler.getClassLoader().loadClass("Ejercicio");

    method = ejercicio.getMethod("solucion", clazz);
  }

  public void testCase(Object[] param, Object expected) throws Exception {
    ByteArrayOutputStream outputCatched = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputCatched));

    Object objResult = method.invoke(null, param);

    testCaseOutput = objResult.toString();

    testCaseResult = objResult.equals(expected);

    testCaseSystemOutput = outputCatched.toString().trim();

    if (!testCaseResult)
      errorCount++;
  }

  public void renderResult(Text testCaseOutput, Text testCaseSystemOutput, Button testCaseBtn) {
    testCaseOutput.setText(this.testCaseOutput);

    toggleSystemOutputClass(testCaseSystemOutput, !hasError);
    testCaseSystemOutput.setText(this.testCaseSystemOutput);

    toggleTestCaseBtnClass(testCaseBtn, testCaseResult);
  }

  public void handleCodeError(Exception e) {
    testCaseOutput = "--";
    testCaseResult = false;
    testCaseSystemOutput = "Error:\n" + e.getMessage();
    hasError = true;
  }

  private void toggleSystemOutputClass(Text testCaseSystemOutput, boolean value) {
    if (value == true) {
      testCaseSystemOutput.getStyleClass().remove("console-output__content--error");
      safeAddClass(testCaseSystemOutput, "console-output__content--success");
    } else {
      testCaseSystemOutput.getStyleClass().remove("console-output__content--success");
      safeAddClass(testCaseSystemOutput, "console-output__content--error");
    }
  }

  private void toggleTestCaseBtnClass(Button testCaseBtn, boolean value) {
    if (value == true) {
      testCaseBtn.getStyleClass().remove("test-btn--error");
      safeAddClass(testCaseBtn, "test-btn--success");
    } else {
      testCaseBtn.getStyleClass().remove("test-btn--success");
      safeAddClass(testCaseBtn, "test-btn--error");
    }
  }

  void safeAddClass(Node node, String className) {
    if (!node.getStyleClass().contains(className))
      node.getStyleClass().add(className);
  }

  public static void closeModal(StackPane modal) {
    FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.5), modal);
    fadeOut.setFromValue(1);
    fadeOut.setToValue(0);
    fadeOut.play();
    fadeOut.setOnFinished(event1 -> modal.setVisible(false));
  }

  public static void openModal(StackPane modal) {
    modal.setVisible(true);
    FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), modal);
    fadeIn.setFromValue(0);
    fadeIn.setToValue(1);
    fadeIn.play();
  }

  public boolean isValid() {
    return errorCount == 0;
  }
}
