package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Deluxe extends Pizza{
    public Deluxe(){
        setToppings(new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE,
                Topping.MUSHROOMS, Topping.ONIONS, Topping.PEPPERS})));
    }

    public static ArrayList<Topping> getToppings(){
        return new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE,
                Topping.MUSHROOMS, Topping.ONIONS, Topping.PEPPERS}));
    }
    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public double price() {
        return 0;
    }
}
