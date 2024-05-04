package com.swiftfingers.decorator3;

import com.swiftfingers.decorator3.concreteComponent.DarkRoast;
import com.swiftfingers.decorator3.concreteComponent.Espresso;
import com.swiftfingers.decorator3.concreteComponent.HouseBlend;
import com.swiftfingers.decorator3.concreteDecorators.Mocha;
import com.swiftfingers.decorator3.concreteDecorators.Soy;
import com.swiftfingers.decorator3.concreteDecorators.Whip;

public class MainTest {
    public static void main(String args[]) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + "$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + "  $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + "  $" + beverage3.cost());
    }
}
