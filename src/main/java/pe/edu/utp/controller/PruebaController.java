package pe.edu.utp.controller;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.SimpleCompiler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

public class PruebaController {
  @FXML
  private WebView codeView;

  @FXML
  private Text result;

  @FXML
  private Text valid;

  @FXML
  private Text prints;

  @FXML
  void initialize() {
    codeView.getEngine().load(getClass().getResource("/pe/edu/utp/monaco/prueba.html").toExternalForm());
  }

  @FXML
  void compile(ActionEvent event) {
    JSObject jsWindow = (JSObject) codeView.getEngine().executeScript("window");
    String code = (String) jsWindow.call("getCode");

    ByteArrayOutputStream outputCatched = new ByteArrayOutputStream();
    PrintStream original = System.out;
    System.setOut(new PrintStream(outputCatched));

    SimpleCompiler compiler = new SimpleCompiler();

    try {
      compiler.cook(code);

      Class<?> clazz = compiler.getClassLoader().loadClass("Probando");

      Method method = clazz.getMethod("calc", Integer.class);
      Object objResult = method.invoke(null, 5);
      result.setText(objResult.toString());

      if (objResult instanceof Integer) {
        if ((Integer) objResult == 12)
          valid.setText("CORRECTO");
        else
          valid.setText("INCORRECTO");
      }

      String out = outputCatched.toString().trim();
      prints.setText(out);

    } catch (Exception e) {
      prints.setText(e.getMessage());
    }

    System.setOut(original);

  }
}
