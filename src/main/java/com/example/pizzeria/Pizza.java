package com.example.pizzeria;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();
    protected boolean isChicago;
    public Pizza(Crust crust, boolean isChicago){
        toppings = new ArrayList<>();
        this.size = Size.MEDIUM;
        this.crust = crust;
        this.isChicago = isChicago;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public ArrayList<Topping> getToppings(){ return toppings; }

    @Override
    public boolean add(Object obj) {
        if(obj instanceof Topping){
            toppings.add((Topping) obj);
        }
        else if(obj instanceof ArrayList){
            toppings.addAll((ArrayList<Topping>) obj);
        }
        else{
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(Object obj){
        if(obj instanceof Topping){
            toppings.remove((Topping) obj);
        }
        else if(obj instanceof ArrayList){
            toppings.removeAll((ArrayList<Topping>) obj);
        }
        else{
            return false;
        }
        return true;
    }
}
