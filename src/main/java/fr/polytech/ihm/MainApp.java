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

        BorderPane borderPane = new BorderPane();

        primaryStage.setTitle("Bienvenue");

        String fxmlFileTop = "/fxml/Haut_de_page.fxml";
        Parent rootNodeTop = FXMLLoader.load(getClass().getResource(fxmlFileTop));
        borderPane.setTop(rootNodeTop);

        String fxmlFileCenter = "/fxml/centerHome.fxml";
        Parent rootNodeCenter = FXMLLoader.load(getClass().getResource(fxmlFileCenter));
        borderPane.setCenter(rootNodeCenter);


        String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
        Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
        borderPane.setBottom(rootNodeBottom);

        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
