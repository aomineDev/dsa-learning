package pe.edu.utp.util;

import javafx.animation.FadeTransition;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.util.Duration;

public class Codeground {
  public static void renderCode(WebView code, String tema) {
    code.getEngine()
        .load(code.getClass().getResource("/pe/edu/utp/monaco/tema" + tema + "/codeground.html").toExternalForm());
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
}
