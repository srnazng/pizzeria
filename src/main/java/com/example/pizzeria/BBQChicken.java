package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class BBQChicken extends Pizza{
    public static final double SMALL_PRICE = 13.99;
    public static final double MED_PRICE = 15.99;
    public static final double LARGE_PRICE = 17.99;

    public BBQChicken(){
        super(new ArrayList<>(List.of(new Topping[]{Topping.BBQ_CHICKEN, Topping.ONIONS, Topping.CHEDDAR, Topping.CILANTRO})));
    }

    public static ArrayList<Topping> getBBQChickenToppings(){
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
        Size size = getSize();
        if(size == Size.SMALL) return SMALL_PRICE;
        if(size == Size.MEDIUM) return MED_PRICE;
        return LARGE_PRICE;
    }
}
