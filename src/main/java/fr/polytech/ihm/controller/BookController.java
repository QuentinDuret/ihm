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
 * Created by Quentin on 15/03/2017.
 */
public class BookController {

    @FXML
    private Pagination pagination;



    @FXML
    public void initialize() throws Exception {

        List<Product> product = Arrays.asList(new Product("/images/book/merlinBook.jpg",10),
                new Product("/images/book/livreDemain.png",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",55),
                new Product("/images/book/merlinBook.jpg",5),
                new Product("/images/book/merlinBook.jpg",5),
                new Product("/images/book/merlinBook.jpg",5));

        Products products = new Products(product);


        CreatePagination createPagination = new CreatePagination();


        pagination.setPageCount(products.getProducts().size());
        pagination.setPageFactory((Integer pageIndex) -> createPagination.createPageProducts(pageIndex/4, products));


    }

}
