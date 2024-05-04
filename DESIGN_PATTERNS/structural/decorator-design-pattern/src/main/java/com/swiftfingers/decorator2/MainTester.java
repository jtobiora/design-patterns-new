package com.swiftfingers.decorator2;

import com.swiftfingers.decorator2.concrete_component.SimplyNonVegPizza;
import com.swiftfingers.decorator2.concrete_component.SimplyVegPizza;
import com.swiftfingers.decorator2.concrete_decorators.*;

import java.text.DecimalFormat;


/*
* In the class below, first we have created a SimplyVegPizza and then decorated it with RomaTomatoes, GreenOlives,
* and Spinach. The desc in the output shows the toppings added in the SimplyVegPizza and the price are the sum of all.
* We did the same thing for the SimplyNonVegPizza and added different topping on it. Please note that you can decorate the
* same thing more than once for an object. In the above example, we added cheese twice; it got added twice in the price too,
* which can be seen in the output.
* The Decorator Design Pattern looks good when you need to add extra functionality to an object with modifying it, at
* runtime
*
* **/
public class MainTester {

    public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();
        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);
        System.out.println("Desc: "+pizza.getDesc());
        System.out.println("Price: "+dformat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        System.out.println("Desc: "+pizza.getDesc());
        System.out.println("Price: "+dformat.format(pizza.getPrice()));
    }
}
