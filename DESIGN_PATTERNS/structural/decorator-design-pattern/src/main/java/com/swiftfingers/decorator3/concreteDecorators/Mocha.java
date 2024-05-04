package com.swiftfingers.decorator3.concreteDecorators;


import com.swiftfingers.decorator3.Beverage;
import com.swiftfingers.decorator3.CondimentDecorator;

//Concrete Decorators
public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return .20 + beverage.cost();
    }
}
