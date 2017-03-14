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

        AnchorPane anchorPane = new AnchorPane();

        try {

            String fxmlFile = "/fxml/Haut_de_page.fxml";
            Parent rootNode = FXMLLoader.load(getClass().getResource(fxmlFile));
            AnchorPane.setTopAnchor(rootNode,0.0);

            Parent rootNodeTop = FXMLLoader.load(getClass().getResource(nameFileCenter));
            AnchorPane.setRightAnchor(rootNodeTop,0.0);

            String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
            Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
            AnchorPane.setBottomAnchor(rootNodeBottom,0.0);

            String fxmlFileLeft = "/fxml/Barre_Recherche.fxml";
            Parent rootNodeLeft = FXMLLoader.load(getClass().getResource(fxmlFileLeft));
            AnchorPane.setLeftAnchor(rootNodeLeft,0.0);


            anchorPane.getChildren().addAll(rootNode,rootNodeBottom,rootNodeLeft,rootNodeTop);
        }
        catch (Exception e){
            JOptionPane.showInputDialog(null, e);
        }

        Scene scene = new Scene(anchorPane);
        scene.getStylesheets().add("/css/presentation.css");

        return scene;

    }

}
