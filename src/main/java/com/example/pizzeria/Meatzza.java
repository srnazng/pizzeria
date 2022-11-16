package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Meatzza extends Pizza{
    public Meatzza(){
        setToppings(new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE, Topping.HAM})));
    }
    public static ArrayList<Topping> getToppings(){
        return new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE, Topping.HAM}));
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
