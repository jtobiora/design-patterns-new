package com.swiftfingers.decorator2.concrete_decorators;


import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;

//concrete decorator class
public class Ham extends PizzaDecorator {
    private final Pizza pizza;
    public Ham(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Ham (18.12)";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice()+18.12;
    }
}