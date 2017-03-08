package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Quentin on 07/03/2017.
 */
public class TopController {


    @FXML
    private Button basket;

    @FXML
    void clickBasket(MouseEvent event) {
        openScene("/fxml/commande.fxml");
    }


    private void openScene (String fxmlFile){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            JOptionPane.showInputDialog(null, e);
        }
    }


}
