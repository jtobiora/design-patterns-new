package com.swiftfingers.decorator3.concreteDecorators;

import com.swiftfingers.decorator3.Beverage;
import com.swiftfingers.decorator3.CondimentDecorator;

//Concrete Decorators
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        return .15 + beverage.cost();
    }
}
