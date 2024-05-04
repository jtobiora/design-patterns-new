package com.swiftfingers.decorator2.concrete_decorators;

import com.swiftfingers.decorator2.Pizza;


//Concrete Decorator class
public class FetaCheese implements Pizza{
    private final Pizza pizza;
    public FetaCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Feta Cheese (25.88)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+25.88;
    }
}
