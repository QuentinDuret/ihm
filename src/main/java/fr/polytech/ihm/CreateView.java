package fr.polytech.ihm;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javax.swing.*;

/**
 * Created by Quentin on 08/03/2017.
 */
public class CreateView {

    private String nameFileCenter;

    public CreateView(String nameFileCenter){
        this.nameFileCenter = nameFileCenter;
    }

    public Scene addCenter() {

        BorderPane borderPane = new BorderPane();

        try {

            String fxmlFileTop = "/fxml/Haut_de_page.fxml";
            Parent rootNodeTop = FXMLLoader.load(getClass().getResource(fxmlFileTop));
            borderPane.setTop(rootNodeTop);

            Parent rootNodeCenter = FXMLLoader.load(getClass().getResource(nameFileCenter));
            borderPane.setCenter(rootNodeCenter);

            String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
            Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
            borderPane.setBottom(rootNodeBottom);

            String fxmlFileLeft = "/fxml/Barre_Recherche.fxml";
            Parent rootNodeLeft = FXMLLoader.load(getClass().getResource(fxmlFileLeft));
            borderPane.setLeft(rootNodeLeft);
        }
        catch (Exception e){
            JOptionPane.showInputDialog(null, e);
        }

        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("/css/presentation.css");

        return scene;

    }

}
