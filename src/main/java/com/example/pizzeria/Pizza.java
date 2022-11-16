package com.example.pizzeria;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();

    protected void setToppings(ArrayList<Topping> list){
        toppings = list;
    }
}
