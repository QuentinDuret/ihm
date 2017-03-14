package fr.polytech.ihm.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by Quentin on 08/03/2017.
 */
public class Products {

    private ObservableList<Product> products;

    public Products(List<Product> promotionalProduct){
        this.products = FXCollections.observableArrayList(promotionalProduct);
    }

    public ObservableList<Product> getProducts() {
        return products;
    }

    public void addPromotionalProduct(Product product){
        products.add(product);
    }

}
