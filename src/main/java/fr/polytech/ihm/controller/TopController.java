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
    private Button dvd;

    @FXML
    private Button logo;

    @FXML
    private Button book;

    @FXML
    private Button cd;

    @FXML
    void clickBasket(MouseEvent event) {
        OpenFxml openFxml = new OpenFxml("/fxml/commande.fxml");
        openFxml.open();
    }

    @FXML
    void clickBook(MouseEvent event) {
        Stage stage = (Stage) book.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/CenterBook.fxml");
        openFxml.open(stage);
    }

    @FXML
    void clickCd(MouseEvent event) {
        Stage stage = (Stage) cd.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/CenterCd.fxml");
        openFxml.open(stage);
    }

    @FXML
    void clickDvd(MouseEvent event) {
        Stage stage = (Stage) dvd.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/centerDvd.fxml");
        openFxml.open(stage);
    }

    @FXML
    void clickLogo(MouseEvent event) {
        Stage stage = (Stage) logo.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/centerHome.fxml");
        openFxml.open(stage);
    }






}
