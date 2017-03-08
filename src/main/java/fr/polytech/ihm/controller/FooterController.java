package fr.polytech.ihm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class FooterController {

    @FXML
    private Hyperlink email;

    @FXML
    private Button teaches;

    @FXML
    private Button twitter;

    @FXML
    private Button facebook;

    @FXML
    void clickEmail(ActionEvent event) {
        openScene( "/fxml/email.fxml");
    }

    @FXML
    void clickFacebook(ActionEvent event) {
        openScene( "/fxml/Facebook.fxml");
    }

    @FXML
    void clickTwitter(ActionEvent event) {
        openScene( "/fxml/Twitter.fxml");
    }

    @FXML
    void clikTeaches(ActionEvent event) {
        openScene( "/fxml/Teaches.fxml");
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