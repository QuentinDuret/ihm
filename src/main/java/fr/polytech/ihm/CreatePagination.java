package fr.polytech.ihm;

import fr.polytech.ihm.model.PromotionalProduct;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import javax.swing.*;

/**
 * Created by Quentin on 11/03/2017.
 */
public class CreatePagination {

    public StackPane createPage(int pageIndex, PromotionalProduct promotionalProduct){

        StackPane stackPane = new StackPane();


        int page = pageIndex ;
        for (int i = page; i < page + 1 ; i++) {
            try {
                String imageName = promotionalProduct.getPromotionalProduct().get(i).getName();

                Image image = new Image(imageName);
                ImageView imageView = new ImageView(image);
                if(image.getHeight()>280) {
                    imageView.setFitHeight(280);
                }
                if(image.getWidth()>700) {
                    imageView.setFitWidth(700);
                }
                StackPane element = new StackPane(imageView);

                element.setCenterShape(true);

                stackPane.getChildren().add(element);
                stackPane.setCenterShape(true);
            }
            catch (Exception e){
                JOptionPane.showInputDialog(null, e);
            }
        }
        return stackPane;
    }

}
