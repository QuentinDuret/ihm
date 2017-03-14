package fr.polytech.ihm.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Campo on 11/03/2017.
 */
public class Item {
    private final SimpleStringProperty item;
    private final SimpleBooleanProperty check1;

    public Boolean isCheck1() { return check1.get(); }

    public String getItem() {
        return item.get();
    }

    public Item(String item, Boolean check1){
        this.item = new SimpleStringProperty(item);
        this.check1 = new SimpleBooleanProperty(check1);
    }

}
