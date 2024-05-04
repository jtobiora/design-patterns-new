package com.swiftfingers.decorator2.concrete_component;


import com.swiftfingers.decorator2.Pizza;

//Concrete component of Pizza interface
public class SimplyNonVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyNonVegPizza (350)";
    }
    @Override
    public double getPrice() {
        return 350;
    }
}
