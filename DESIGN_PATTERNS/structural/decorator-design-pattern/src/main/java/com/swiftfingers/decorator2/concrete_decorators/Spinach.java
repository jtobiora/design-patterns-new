package com.swiftfingers.decorator2.concrete_decorators;

import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;

public class Spinach extends PizzaDecorator {
    private final Pizza pizza;
    public Spinach(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Spinach (7.92)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+7.92;
    }
}