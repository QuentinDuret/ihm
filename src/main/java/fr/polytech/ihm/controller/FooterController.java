package fr.polytech.ihm.controller;

import fr.polytech.ihm.OpenFxml;
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
        OpenFxml openFxml = new OpenFxml("/fxml/email.fxml");
        openFxml.open();
    }

    @FXML
    void clickFacebook(ActionEvent event) {
        OpenFxml openFxml = new OpenFxml("/fxml/Facebook.fxml");
        openFxml.open();
    }

    @FXML
    void clickTwitter(ActionEvent event) {
        OpenFxml openFxml = new OpenFxml("/fxml/Twitter.fxml");
        openFxml.open();
    }


    @FXML
    void clikTeaches(ActionEvent event) {
        OpenFxml openFxml = new OpenFxml("/fxml/Teaches.fxml");
        openFxml.open();
    }

}