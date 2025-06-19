package pe.edu.utp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        App.stage = stage;
        loadPoppinsFont();
        scene = new Scene(loadFXML("HomeView"));
        stage.setScene(scene);
        stage.setTitle("Sistema Educativo - Estructura de Datos");
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        stage.sizeToScene();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public void loadPoppinsFont() {
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Black.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-BlackItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Bold.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-BoldItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-ExtraBold.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-ExtraBoldItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-ExtraLight.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-ExtraLightItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Italic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Light.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-LightItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Medium.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-MediumItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Regular.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-SemiBold.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-SemiBoldItalic.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-Thin.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("font/Poppins/Poppins-ThinItalic.ttf").toExternalForm(), 12);
    }

}