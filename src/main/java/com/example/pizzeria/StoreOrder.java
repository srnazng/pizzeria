package com.example.pizzeria;

import java.util.ArrayList;

public class StoreOrder implements Customizable{
    private static ArrayList<Order> orderList;
    private static Order currentOrder;

    public void completeCurrentOrder(){
        currentOrder.finishOrder();
        currentOrder = new Order();
    }

    public static Order getCurrentOrder(){
        if(orderList == null){
            orderList = new ArrayList<>();
        }
        if(currentOrder == null){
            currentOrder = new Order();
        }
        return currentOrder;
    }

    public static int generateOrderId(){
        return orderList.size() + 1;
    }

    @Override
    public boolean add(Object obj) {
        return false;
    }

    /**
     * Marks order as invalid (to keep id numbers unique)
     * @param obj   Order
     * @return      true if success, false otherwise
     */
    @Override
    public boolean remove(Object obj) {
        Order o = (Order) obj;
        if(o.isValid()){
            o.setInvalid();
            return true;
        }

        return false;
    }
}
