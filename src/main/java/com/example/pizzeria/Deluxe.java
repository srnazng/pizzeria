package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Deluxe extends Pizza{
    public static final double SMALL_PRICE = 14.99;
    public static final double MED_PRICE = 16.99;
    public static final double LARGE_PRICE = 18.99;

    public Deluxe(){
        super(new ArrayList<>(List.of(new Topping[]{Topping.PEPPERONI, Topping.SAUSAGE,
                Topping.MUSHROOMS, Topping.ONIONS, Topping.PEPPERS})));
    }

    public static ArrayList<Topping> getDeluxeToppings(){
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
        Size size = getSize();
        if(size == Size.SMALL) return SMALL_PRICE;
        if(size == Size.MEDIUM) return MED_PRICE;
        return LARGE_PRICE;
    }
}
