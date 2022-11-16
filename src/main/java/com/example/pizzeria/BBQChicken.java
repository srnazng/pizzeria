package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class BBQChicken extends Pizza{
    public BBQChicken(){
        setToppings(new ArrayList<>(List.of(new Topping[]{Topping.BBQ_CHICKEN, Topping.ONIONS, Topping.CHEDDAR, Topping.CILANTRO})));
    }

    public static ArrayList<Topping> getToppings(){
        return new ArrayList<>(List.of(new Topping[]{Topping.BBQ_CHICKEN, Topping.ONIONS, Topping.CHEDDAR, Topping.CILANTRO}));
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
