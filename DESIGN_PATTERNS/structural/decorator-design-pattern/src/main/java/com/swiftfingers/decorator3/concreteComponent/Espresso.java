package com.swiftfingers.decorator3.concreteComponent;

import com.swiftfingers.decorator3.Beverage;


//Concrete component
public class Espresso extends Beverage {

    public Espresso() {
        String desc = getDescription();
        desc = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
