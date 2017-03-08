package fr.polytech.ihm.controller;

import fr.polytech.ihm.OpenFxml;
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
        OpenFxml openFxml = new OpenFxml("/fxml/commande.fxml");
        openFxml.open();
    }




}
