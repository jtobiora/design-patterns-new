package com.swiftfingers.decorator3.concreteComponent;


import com.swiftfingers.decorator3.Beverage;

//Concrete component
public class DarkRoast extends Beverage {

    public DarkRoast() {
        String desc = getDescription();
        desc = "DarkRoast";
    }
    public double cost() {
        return 2.44;
    }
}