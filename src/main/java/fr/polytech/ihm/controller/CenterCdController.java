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
public class CenterCdController {

    @FXML
    private Pagination pagination;

    @FXML
    private GridPane flagshipProduct;

    @FXML
    public void initialize() throws Exception {

        List<Product> product = Arrays.asList(new Product("/images/cd/soldesCd.JPG",10),
                new Product("/images/cd/cdAdele.jpg",10),
                new Product("/images/cd/Many-faces-of-daft-punk-3-CD.jpg",10));

        PromotionalProduct promotionalProduct = new PromotionalProduct(product);

        CreatePagination createPagination = new CreatePagination();

        pagination.setPageCount(promotionalProduct.getPromotionalProduct().size());
        pagination.setPageFactory((Integer pageIndex) -> createPagination.createPage(pageIndex, promotionalProduct));

    }
}
