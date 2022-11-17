package com.example.pizzeria;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();

    public Pizza(ArrayList<Topping> list){
        size = Size.MEDIUM;
        toppings = list;
    }

    public Size getSize() {
        return size;
    }

    public ArrayList<Topping> getToppings(){ return toppings; }
}
