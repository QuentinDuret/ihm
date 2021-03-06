package fr.polytech.ihm.controller;

import fr.polytech.ihm.CreateView;
import fr.polytech.ihm.OpenFxml;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
    private Button stageDev;

    @FXML private Button knowMore;

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

    @FXML
    void clickStage(MouseEvent event) {
        Stage stage = (Stage) stageDev.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/CenterStage.fxml");
        openFxml.open(stage);

    }

    @FXML
    void clickKnowMore(MouseEvent event){
        OpenFxml openFxml = new OpenFxml("/fxml/chartChart.fxml");
        openFxml.open();
    }



}
