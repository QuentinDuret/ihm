package fr.polytech.ihm;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import javax.swing.*;

import static javafx.geometry.HPos.RIGHT;
import static javafx.geometry.Pos.CENTER_RIGHT;

/**
 * Created by Quentin on 08/03/2017.
 */
public class CreateView {

    private String nameFileCenter;

    public CreateView(String nameFileCenter){
        this.nameFileCenter = nameFileCenter;
    }

    public Scene addCenter() {

        GridPane gridPane = new GridPane();

        try {

            String fxmlFile = "/fxml/Haut_de_page.fxml";
            Parent rootNode = FXMLLoader.load(getClass().getResource(fxmlFile));
            gridPane.add(rootNode,0,0);

            String fxmlFileLeft = "/fxml/Barre_Recherche.fxml";
            Parent rootNodeLeft = FXMLLoader.load(getClass().getResource(fxmlFileLeft));
            gridPane.add(rootNodeLeft,0,1);

            AnchorPane.setLeftAnchor(rootNodeLeft,0.0);
            Parent rootNodeTop = FXMLLoader.load(getClass().getResource(nameFileCenter));
            gridPane.add(rootNodeTop,0,1);
            gridPane.setHalignment(rootNodeTop,RIGHT);

            String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
            Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
            gridPane.add(rootNodeBottom,0,2);

        }
        catch (Exception e){
            JOptionPane.showInputDialog(null, e);
        }

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("/css/presentation.css");

        return scene;

    }

}
