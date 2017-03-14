package fr.polytech.ihm;

import fr.polytech.ihm.model.Product;
import fr.polytech.ihm.model.Products;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.List;

/**
 * Created by Quentin on 14/03/2017.
 */
public class CreateGridPane {

    public GridPane create(Products products, GridPane gridPane){

        int nbImages =0;
        for (int i = 0; i<2;i++){
            for (int j =0; j<3;j++){

                Image image = new Image(products.getProducts().get(nbImages++).getName());
                ImageView imageView = new ImageView(image);

                if (image.getHeight()>150.0){
                    imageView.setFitHeight(150.0);
                }
                if (image.getWidth()>210){
                    imageView.setFitWidth(210.0);
                }

                gridPane.add(imageView,j,i);
            }
        }

        return gridPane;
    }
}
