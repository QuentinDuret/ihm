package fr.polytech.ihm.controller;

import fr.polytech.ihm.CreatePagination;
import fr.polytech.ihm.model.Product;
import fr.polytech.ihm.model.PromotionalProduct;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Pagination;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Quentin on 04/03/2017.
 */
public class CenterController {

    @FXML
    private Pagination pagination;

    @FXML
    private GridPane flagshipProduct;

    @FXML
    public void initialize() throws Exception {

        List<Product> product = Arrays.asList(new Product("/images/Soldes.jpg",10),
                new Product("/images/book/merlinBook.jpg",10),
                new Product("/images/book/livreDemain.png",10),
                new Product("/images/cd/cdAdele.jpg",10));

        PromotionalProduct promotionalProduct = new PromotionalProduct(product);

        CreatePagination createPagination = new CreatePagination();

        pagination.setPageCount(promotionalProduct.getPromotionalProduct().size());
        pagination.setPageFactory((Integer pageIndex) -> createPagination.createPage(pageIndex, promotionalProduct));

    }



}
