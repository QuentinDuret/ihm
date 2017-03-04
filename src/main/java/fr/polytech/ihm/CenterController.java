package fr.polytech.ihm;

import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Quentin on 04/03/2017.
 */
public class CenterController {

    private static final List<String> image = Arrays.asList("/images/book/merlinBook.jpg", "/images/book/livreDemain.png", "/images/cd/cdAdele.jpg");

    private static final int numberPage = 3;


    @FXML
    private Pagination pagination;

    @FXML
    private GridPane flagshipProduct;




    public Pane createPage(int pageIndex){

        Pane pane = new Pane();

        pane.setPrefSize(700,340);

        VBox box = new VBox(5);
        int page = pageIndex ;
        for (int i = page; i < page + 1 ; i++) {
            try {
                String imageName = image.get(i);

                Image image = new Image(imageName);
                ImageView imageView = new ImageView(image);

                Pane element = new Pane(imageView);

                pane.getChildren().add(element);

            }
            catch (Exception e){
                JOptionPane.showInputDialog(null, e);
            }
        }
        return pane;
    }

    @FXML
    public void initialize() throws Exception {
        pagination.setPageCount(numberPage);
        pagination.setPageFactory((Integer pageIndex) -> createPage(pageIndex));

    }



}
