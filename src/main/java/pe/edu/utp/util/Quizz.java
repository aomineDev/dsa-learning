package pe.edu.utp.util;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Quizz {
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
}
