package com.swiftfingers.decorator2.concrete_decorators;

import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;

public class RedOnions extends PizzaDecorator {
    private final Pizza pizza;
    public RedOnions(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Red Onions (3.75)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+3.75;
    }
}