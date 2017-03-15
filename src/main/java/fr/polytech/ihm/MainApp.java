package fr.polytech.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MainApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Bienvenue");

        CreateView createView = new CreateView("/fxml/centerHome.fxml");
        primaryStage.setScene(createView.addCenter());

        primaryStage.show();
    }
}
