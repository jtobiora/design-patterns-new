package com.swiftfingers.decorator2.concrete_decorators;


import com.swiftfingers.decorator2.Pizza;
import com.swiftfingers.decorator2.PizzaDecorator;

//Concrete Decorator class
public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;
    public Broccoli(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDesc() {
        return pizza.getDesc()+", Broccoli (9.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+9.25;
    }
}
