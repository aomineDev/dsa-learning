package pe.edu.utp.util;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Quizz {
  private static int index;
  private static int errorCount;

  public static void handleQUizz1Buttons(ActionEvent event, VBox btnContainer, Button nextBtn) {
    Button clickedBtn = (Button) event.getSource();

    btnContainer.getChildren().forEach(node -> {
      Button btn = (Button) node;

      btn.setDisable(true);

      if (btn.getId() != null) {
        btn.getStyleClass().add("btn-quizz--success");
      } else if (btn.equals(clickedBtn)) {
        btn.getStyleClass().add("btn-quizz--error");
      }
    });

    nextBtn.setVisible(true);
  }

  public static boolean handleQuizzInputs(VBox code, String[] answers) {
    index = 0;
    errorCount = 0;

    code.getChildren().forEach(node -> {
      HBox line = (HBox) node;

      line.getChildren().forEach(subnode -> {
        if (!(subnode instanceof TextField))
          return;

        TextField input = (TextField) subnode;

        if (input.getText().equals(answers[index++]))
          input.getStyleClass().add("quizz-code--success");
        else {
          errorCount++;
          input.getStyleClass().add("quizz-code--error");
        }
      });
    });

    return errorCount == 0;
  }
}
