package com.swiftfingers.factory1;

import java.util.ArrayList;

public class ConsumerClass {
    public AbstractFood placeOrder(String itemName,int quantity,String itemType) {
        AbstractFoodFactory a = null;
        if(itemType.equals("italian")) {
            a = new ItalianFoodFactory();
        }else if(itemType.equals("mexican")) {
            a = new MexicanFoodFactory();
        }else if(itemType.equals("chinese")) {
            a = new ItalianFoodFactory();
        }
        if(a!=null) {
            return a.placeOrder(itemName, quantity);
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        boolean orderCreated = false;
        ArrayList order;
        ConsumerClass c = new ConsumerClass();
        order = new ArrayList();
        order.add(c.placeOrder("Lazagne", 2, "italian"));
        order.add(c.placeOrder("Taco", 3, "mexican"));
        order.add(c.placeOrder("Noodles", 1, "chinese"));
        System.out.println(order);
    }

}
