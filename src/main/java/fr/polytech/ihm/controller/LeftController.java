package fr.polytech.ihm.controller;


import fr.polytech.ihm.OpenFxml;
import fr.polytech.ihm.model.Item;
import fr.polytech.ihm.model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Campo on 04/03/2017.
 */
public class LeftController {

    @FXML private TextField SearchBar;
    @FXML private Button searchButton;
    @FXML private CheckBox livreCheck;
    @FXML private CheckBox dvdCheck;
    @FXML private CheckBox cdCheck;
    @FXML private CheckBox stageCheck;
    @FXML private CheckBox zeroCheck;
    @FXML private CheckBox dixCheck;
    @FXML private CheckBox cinquanteCheck;
    @FXML private Button rayonCheck;

    public void clickOnButton(ActionEvent event) {
        openSearch(SearchBar.getText());
    }

    public void newSearch(ActionEvent event){
        openSearch(SearchBar.getText());
    }

    public void checkRayon(ActionEvent event) {checkBox(livreCheck,dvdCheck,cdCheck,stageCheck);}

    public void checkBox (CheckBox livreCheck, CheckBox dvdCheck, CheckBox cdCheck, CheckBox stageCheck){
        if (livreCheck.isSelected()){
            changeCenter("CenterBook");
        }
        else if (dvdCheck.isSelected()){
            changeCenter("centerDVD");
        }
        else if (cdCheck.isSelected()){
            changeCenter("CenterCd");
        }
        else if (stageCheck.isSelected()){
            changeCenter("CenterStage");
        }
    }

    public void checkPrice (ActionEvent event){ checkBoxPrice(zeroCheck, dixCheck, cinquanteCheck);}

    private void checkBoxPrice(CheckBox zeroCheck, CheckBox dvdCheck, CheckBox cinquanteCheck){
       if (zeroCheck.isSelected()){
           changeCenter("cheap");
       }
       else if (dixCheck.isSelected()){
            changeCenter("average");
       }
       else if (cinquanteCheck.isSelected()){
           changeCenter("expensive");
       }
    }

    public void openSearch(String name){
        switch (name) {
            case "Livre":
            case "livre":
            case "Livres":
            case "livres":
                changeCenter("CenterBook");
                break;
            case "DVD":
            case "dvd":
            case "Dvd":
                changeCenter("centerDVD");
                break;
            case "CD":
            case "cd":
            case "Cd":
                changeCenter("CenterCD");
                break;
            case "Stages":
            case "Stage":
            case "stage":
            case "stages":
                changeCenter("CenterStage");
                break;
            case "Panier":
            case "panier":
                changeCenter("commande");
            default:
                System.out.println("Cette page n'est pas encore implémentée.");
                break;
        }
    }

    private void changeCenter (String nameFxml){
        Stage stage = (Stage) searchButton.getScene().getWindow();
        OpenFxml openFxml = new OpenFxml("/fxml/"+nameFxml+".fxml");
        openFxml.open(stage);

    }



}
