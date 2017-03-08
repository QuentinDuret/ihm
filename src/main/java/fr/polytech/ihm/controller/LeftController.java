package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Campo on 04/03/2017.
 */
public class LeftController {

    @FXML
    private TextField SearchBar;
    @FXML
    private Button searchButton;
    @FXML
    private TableView<Product> itemTable;
    @FXML
    private TableColumn<Product,String> item;
    @FXML
    private TableColumn<Product,CheckBox> check1;

    private List products = new ArrayList<String>();
    private int listSize =0;
    private String product = "";

    @FXML
    void clickOnButton(ActionEvent event) {
        SearchBar.getText();
        String product = SearchBar.getText();
    }

    public List createProductsList(){
        products.add("Livres");
        listSize++;
        products.add("CD");
        listSize++;
        products.add("DVD");
        listSize++;
        products.add("Stages");
        listSize++;
        products.add("Adele");
        listSize++;
        return products;
    }

   /* @FXML
    public void initialize(){
        ObservableList<Product> departments = FXCollections.observableArrayList();
        departments.add(new Product("SI", "Sciences Informatiques", "O+110", Color.BLUEVIOLET, siInternships));
        departments.add(new Product("ELEC", "Electronique", "O+111", Color.ORANGE, elecInternships));

        tag.setCellValueFactory(cellData -> cellData.getValue().tagNameProperty());
        name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        room.setCellValueFactory(cellData -> cellData.getValue().meetingRoomProperty());
    }*/

    public String newSearch(ActionEvent event){
        createProductsList();

        for (int i = 0 ; i < listSize ; i++){
            if (SearchBar.getText().equals(products.get(i))){
                System.out.println("ok");
                try {
                    BorderPane borderPane = new BorderPane();

                    Scene scene = new Scene(borderPane);
                    Stage stage = new Stage();

                    String fxmlFileTop = "/fxml/Haut_de_page.fxml";
                    Parent rootNodeTop = FXMLLoader.load(getClass().getResource(fxmlFileTop));
                    borderPane.setTop(rootNodeTop);

                    String fxmlFileCenter = "/fxml/"+products.get(i)+".fxml";
                    Parent rootNodeCenter = FXMLLoader.load(getClass().getResource(fxmlFileCenter));
                    borderPane.setCenter(rootNodeCenter);


                    String fxmlFileBottom = "/fxml/Bas_de_page.fxml";
                    Parent rootNodeBottom = FXMLLoader.load(getClass().getResource(fxmlFileBottom));
                    borderPane.setBottom(rootNodeBottom);

                    String fxmlFileLeft = "/fxml/Barre_Recherche.fxml";
                    Parent rootNodeLeft = FXMLLoader.load(getClass().getResource(fxmlFileLeft));
                    borderPane.setLeft(rootNodeLeft);

                    stage.setScene(scene);
                    stage.show();
                }
                catch (IOException e){
                    JOptionPane.showInputDialog(null, e);
                }
            }
        }
        return SearchBar.getText();
    }

    public void items(){

    }

}
