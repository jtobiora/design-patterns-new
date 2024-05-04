package com.swiftfingers.decorator3.concreteComponent;

import com.swiftfingers.decorator3.Beverage;


//Concrete component
public class HouseBlend extends Beverage {
    public HouseBlend() {
        String desc = getDescription();
        desc = "House Blend Coffee";
    }
    public double cost() {
        return .89;
    }
}