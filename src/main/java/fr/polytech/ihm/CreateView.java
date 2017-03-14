package fr.polytech.ihm;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

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

        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(900.0,950.0);

        try {

            String fxmlFileTop = "/fxml/Haut_de_page.fxml";
            Parent rootNodeTop = FXMLLoader.load(getClass().getResource(fxmlFileTop));
            stackPane.getChildren().add(rootNodeTop);
            stackPane.setAlignment(rootNodeTop, Pos.TOP_CENTER);


            Parent rootNodeCenter = FXMLLoader.load(getClass().getResource(nameFileCenter));
            stackPane.getChildren().add(rootNodeCenter);
            stackPane.setAlignment(rootNodeCenter,Pos.CENTER_RIGHT);

            String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
            Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
            stackPane.getChildren().add(rootNodeBottom);
            stackPane.setAlignment(rootNodeBottom,Pos.BOTTOM_CENTER);

            String fxmlFileLeft = "/fxml/Barre_Recherche.fxml";
            Parent rootNodeLeft = FXMLLoader.load(getClass().getResource(fxmlFileLeft));
            stackPane.getChildren().add(rootNodeLeft);
            stackPane.setAlignment(rootNodeLeft,Pos.CENTER_LEFT);
        }
        catch (Exception e){
            JOptionPane.showInputDialog(null, e);
        }

        Scene scene = new Scene(stackPane);
        scene.getStylesheets().add("/css/presentation.css");

        return scene;

    }

}
