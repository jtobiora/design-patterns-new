package com.swiftfingers.decorator3.concreteDecorators;

import com.swiftfingers.decorator3.Beverage;
import com.swiftfingers.decorator3.CondimentDecorator;

//Concrete Decorators
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return .10 + beverage.cost();
    }
}
