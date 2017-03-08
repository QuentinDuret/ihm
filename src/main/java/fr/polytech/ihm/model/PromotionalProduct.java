package fr.polytech.ihm.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by Quentin on 08/03/2017.
 */
public class PromotionalProduct {

    private ObservableList<Product> promotionalProduct;

    public PromotionalProduct(List<Product> promotionalProduct){
        this.promotionalProduct = FXCollections.observableArrayList(promotionalProduct);
    }

    public ObservableList<Product> getPromotionalProduct() {
        return promotionalProduct;
    }

    public void addPromotionalProduct(Product product){
        promotionalProduct.add(product);
    }

}
