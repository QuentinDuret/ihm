package fr.polytech.ihm.controller;

import fr.polytech.ihm.CreateGridPane;
import fr.polytech.ihm.CreatePagination;
import fr.polytech.ihm.model.Product;
import fr.polytech.ihm.model.Products;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.layout.GridPane;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Quentin on 11/03/2017.
 */
public class CenterBookController {

    @FXML
    private Pagination pagination;

    @FXML
    private GridPane flagshipProduct;

    @FXML
    public void initialize() throws Exception {

        List<Product> product = Arrays.asList(new Product("/images/book/SoldesLivre.jpg",10),
                new Product("/images/book/livreDemain.png",55),
                new Product("/images/book/merlinBook.jpg",5));

        Products products = new Products(product);

        List<Product> productFlagship = Arrays.asList(new Product("/images/book/merlinBook.jpg",10),
                new Product("/images/book/merlinBook.jpg",10),
                new Product("/images/book/livreDemain.png",10),
                new Product("/images/book/livreDemain.png",10),
                new Product("/images/book/livreDemain.png",10),
                new Product("/images/book/merlinBook.jpg",10));

        Products productsFlagship = new Products(productFlagship);

        CreatePagination createPagination = new CreatePagination();
        CreateGridPane gridPane = new CreateGridPane();


        pagination.setPageCount(products.getProducts().size());
        pagination.setPageFactory((Integer pageIndex) -> createPagination.createPage(pageIndex, products));
        flagshipProduct = gridPane.create(productsFlagship, flagshipProduct);

    }
}
