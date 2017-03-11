package fr.polytech.ihm;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Quentin on 08/03/2017.
 */
public class OpenFxml {

    private String name;

    public OpenFxml(String name){
        this.name = name;
    }

    public void open(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(name));
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            JOptionPane.showInputDialog(null, e);
        }
    }


    public void open(Stage stage){
        CreateView createView = new CreateView(name);

        stage.setScene(createView.addCenter());
        stage.show();

    }

}
