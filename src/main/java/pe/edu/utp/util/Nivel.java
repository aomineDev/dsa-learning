package pe.edu.utp.util;

import javafx.scene.control.ComboBox;
import javafx.scene.web.WebView;

public class Nivel {
  private String tema;
  private int nivel;

  public Nivel(String tema, int nivel) {
    this.tema = tema;
    this.nivel = nivel;
  }

  public void setCodeView(WebView code, int n) {
    code.getEngine()
        .load(getClass().getResource("/pe/edu/utp/monaco/" + tema + "/n" + nivel + "_" + n + ".html").toExternalForm());
  }

  public void setNivelItems(ComboBox<String> selector, int max) {
    for (int i = 1; i <= max; i++)
      selector.getItems().add("nivel " + i);

    selector.getSelectionModel().select(nivel - 1);
  }
}
