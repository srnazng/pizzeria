package com.example.pizzeria;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class CartController {
    @FXML
    ListView pizzaList;

    @FXML
    public void initialize(){
        pizzaList.setItems(FXCollections.observableArrayList(StoreOrder.getCurrentOrder().getPizzaDescriptionList()));
    }
}
