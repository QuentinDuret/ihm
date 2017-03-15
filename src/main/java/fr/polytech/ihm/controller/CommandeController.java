package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class CommandeController {

    private Orders orders;

    private String message;

    @FXML
    private TextField orderNumber;

    @FXML
    private Button button;

    public void newSearch(ActionEvent event){
        order();
    }

    @FXML
    void validate(MouseEvent event) {
        order();
    }

    private void order(){
        orders = new Orders();
        message = orderNumber.getText();
        if(orders.isAOrder(message)){
            JOptionPane.showMessageDialog(null, "votre commande est en cours de livraison");
        }
        else {
            JOptionPane.showMessageDialog(null, "numéro de commande invalide");
        }
    }
}
