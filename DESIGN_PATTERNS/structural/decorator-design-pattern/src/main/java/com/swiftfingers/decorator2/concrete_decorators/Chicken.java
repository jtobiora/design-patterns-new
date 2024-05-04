package com.swiftfingers.decorator2.concrete_decorators;

import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;


//concrete decorator class
public class Chicken extends PizzaDecorator {
    private final Pizza pizza;
    public Chicken(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Chicken (12.75)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+12.75;
    }
}