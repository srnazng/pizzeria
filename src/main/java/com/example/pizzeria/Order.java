package com.example.pizzeria;

import java.util.ArrayList;

import static com.example.pizzeria.StoreOrder.generateOrderId;

public class Order implements Customizable{
    private boolean completed;
    private boolean valid;
    private ArrayList<Pizza> pizzaList;
    private int orderNumber;

    public Order(){
        completed = false;
        valid = true;
        orderNumber = generateOrderId();
        pizzaList = new ArrayList<>();
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setPizzaList(ArrayList<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean isCompleted() {
        return completed;
    }

    public ArrayList<Pizza> getPizzaList() {
        return pizzaList;
    }

    public ArrayList<String> getPizzaDescriptionList(){
        ArrayList<String> list = new ArrayList<>();
        for(Pizza p : pizzaList){
            list.add(p.toString());
        }
        return list;
    }

    public void setInvalid(){
        valid = false;
    }

    public boolean isValid(){
        return valid;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void finishOrder(){
        completed = true;
    }

    @Override
    public boolean add(Object obj) {
        Pizza pizza = (Pizza) obj;
        return pizzaList.add(pizza);
    }

    @Override
    public boolean remove(Object obj) {
        Pizza pizza = (Pizza) obj;
        return pizzaList.remove(pizza);
    }
}
