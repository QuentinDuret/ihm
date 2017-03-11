package fr.polytech.ihm.controller;

import fr.polytech.ihm.CreatePagination;
import fr.polytech.ihm.model.Product;
import fr.polytech.ihm.model.PromotionalProduct;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.layout.GridPane;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Quentin on 11/03/2017.
 */
public class CenterDVDController {

    @FXML
    private Pagination pagination;

    @FXML
    private GridPane flagshipProduct;

    @FXML
    public void initialize() throws Exception {

        List<Product> product = Arrays.asList(new Product("/images/dvd/promo.jpg",10),
                new Product("/images/dvd/dvd-coffret-transformers.jpg",10),
                new Product("/images/dvd/filmDocteurFrankeisten.jpg",10));

        PromotionalProduct promotionalProduct = new PromotionalProduct(product);

        CreatePagination createPagination = new CreatePagination();

        pagination.setPageCount(promotionalProduct.getPromotionalProduct().size());
        pagination.setPageFactory((Integer pageIndex) -> createPagination.createPage(pageIndex, promotionalProduct));

    }



}
