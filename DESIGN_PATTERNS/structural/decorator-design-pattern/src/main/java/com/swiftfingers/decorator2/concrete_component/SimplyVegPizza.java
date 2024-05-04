package com.swiftfingers.decorator2.concrete_component;


import com.swiftfingers.decorator2.Pizza;

//Concrete component of Pizza interface
public class SimplyVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyVegPizza (230)";
    }
    @Override
    public double getPrice() {
        return 230;
    }
}
