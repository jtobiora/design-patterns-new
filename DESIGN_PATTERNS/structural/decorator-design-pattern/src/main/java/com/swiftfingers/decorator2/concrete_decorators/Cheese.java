package com.swiftfingers.decorator2.concrete_decorators;

import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;


//Concrete Decorator class
public class Cheese extends PizzaDecorator {
    private final Pizza pizza;
    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Cheese (20.72)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+20.72;
    }
}