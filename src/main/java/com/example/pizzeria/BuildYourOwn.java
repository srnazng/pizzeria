package com.example.pizzeria;

import java.util.ArrayList;

public class BuildYourOwn extends Pizza{
    public static final double SMALL_PRICE = 8.99;
    public static final double MED_PRICE = 10.99;
    public static final double LARGE_PRICE = 12.99;
    public BuildYourOwn() {
        super(new ArrayList<>());
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
        double topping_price = getToppings().size() * 1.59;
        if(size == Size.SMALL) return SMALL_PRICE + topping_price;
        if(size == Size.MEDIUM) return MED_PRICE + topping_price;
        return LARGE_PRICE + topping_price;
    }
}
