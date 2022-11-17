package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Meatzza extends Pizza{
    public static final double SMALL_PRICE = 15.99;
    public static final double MED_PRICE = 17.99;
    public static final double LARGE_PRICE = 19.99;

    public Meatzza(){
        super(new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE, Topping.HAM})));
    }
    public static ArrayList<Topping> getMeatzzaToppings(){
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
        Size size = getSize();
        if(size == Size.SMALL) return SMALL_PRICE;
        if(size == Size.MEDIUM) return MED_PRICE;
        return LARGE_PRICE;
    }
}
