package com.example.pizzeria;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ChicagoController {
    private ArrayList<Topping> availableToppings;
    private ArrayList<Topping> selectedToppings;
    @FXML
    private ComboBox chicagoTypeSelect;
    @FXML
    private ListView chicagoAvailableToppings, chicagoSelectedToppings;
    @FXML
    private ImageView chicagoImageView;
    @FXML
    private ToggleGroup chicagoSize;

    @FXML
    public void updateView(){
        String pizzaType = chicagoTypeSelect.getValue().toString();
        availableToppings = new ArrayList<>(Topping.getAvailableToppings());
        if(pizzaType.equals("Deluxe") || pizzaType.equals("BBQ Chicken") || pizzaType.equals("Meatzza")){
            chicagoAvailableToppings.setDisable(true);
            chicagoSelectedToppings.setDisable(true);
            if(pizzaType.equals("BBQ Chicken")){
                selectedToppings = BBQChicken.getToppings();
                availableToppings.removeAll(BBQChicken.getToppings());
                chicagoImageView.setImage(new Image("file:./src/main/resources/assets/chicago_bbq_chicken.jpg"));
            }
            else if(pizzaType.equals("Deluxe")){
                selectedToppings = Deluxe.getToppings();
                availableToppings.removeAll(Deluxe.getToppings());
                chicagoImageView.setImage(new Image("file:./src/main/resources/assets/chicago_deluxe.jpeg"));
            }
            else if(pizzaType.equals("Meatzza")) {
                selectedToppings = Meatzza.getToppings();
                availableToppings.removeAll(Meatzza.getToppings());
                chicagoImageView.setImage(new Image("file:./src/main/resources/assets/chicago_meatzza.jpeg"));
            }
        }
        else{
            selectedToppings = new ArrayList<>();
            chicagoAvailableToppings.setDisable(false);
            chicagoSelectedToppings.setDisable(false);
            chicagoImageView.setImage(new Image("file:./src/main/resources/assets/chicago_pizza.jpeg"));
        }
        updateToppingLists();
    }

    @FXML
    public void addTopping(){
        Topping topping = (Topping) chicagoAvailableToppings.getSelectionModel().getSelectedItem();
        if(topping != null){
            availableToppings.remove(topping);
            selectedToppings.add(topping);
            chicagoAvailableToppings.setItems(FXCollections.observableArrayList(availableToppings));
            chicagoSelectedToppings.setItems(FXCollections.observableArrayList(selectedToppings));
        }
    }

    @FXML
    public void removeTopping(){
        Topping topping = (Topping) chicagoSelectedToppings.getSelectionModel().getSelectedItem();
        if(topping != null){
            availableToppings.add(topping);
            selectedToppings.remove(topping);
            chicagoAvailableToppings.setItems(FXCollections.observableArrayList(availableToppings));
            chicagoSelectedToppings.setItems(FXCollections.observableArrayList(selectedToppings));
        }
    }

    @FXML
    public void initialize(){
        String[] pizzaTypes = {"Deluxe", "BBQ Chicken", "Meatzza", "Build Your Own"};
        chicagoTypeSelect.setItems(FXCollections.observableArrayList(pizzaTypes));
        chicagoTypeSelect.setValue("Build Your Own");
        availableToppings = new ArrayList<>(Topping.getAvailableToppings());
        selectedToppings = new ArrayList<>();
        updateToppingLists();
    }

    private void updateToppingLists(){
        chicagoAvailableToppings.setItems(FXCollections.observableArrayList(availableToppings));
        chicagoSelectedToppings.setItems(FXCollections.observableArrayList(selectedToppings));
    }
}
