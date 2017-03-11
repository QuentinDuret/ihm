package fr.polytech.ihm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quentin on 08/03/2017.
 */
public class Orders {

    private List<Order> orders;

    public Orders(){
        this.add();
    }

    private void add(){
        orders = new ArrayList<>();
        orders.add(new Order("1"));
        orders.add(new Order("2"));
        orders.add(new Order("3"));
        orders.add(new Order("4"));
    }

    public boolean isAOrder(String orderNumber){

        for(int i=0; i< orders.size(); i++){
            if(orderNumber.equals(orders.get(i).getOrderNumber())){
                return true;
            }
        }

        return false;
    }
}
