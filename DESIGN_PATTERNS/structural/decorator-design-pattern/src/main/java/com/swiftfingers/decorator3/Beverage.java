package com.swiftfingers.decorator3;


//Main component
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}