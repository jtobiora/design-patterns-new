package com.swiftfingers.decorator2;

public abstract class PizzaDecorator implements Pizza {
    @Override
    public String getDesc() {
        return "Toppings";
    }
}