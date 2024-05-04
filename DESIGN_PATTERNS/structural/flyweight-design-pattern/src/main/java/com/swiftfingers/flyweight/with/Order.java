package com.swiftfingers.flyweight.with;


import com.swiftfingers.flyweight.CoffeeFlavour;
import com.swiftfingers.flyweight.CoffeeLatteArt;

public class Order {

	protected Coffee coffee;

	public Order(Coffee coffee) {
		super();
		this.coffee = coffee;
	}

	public static Order of(CoffeeFlavour flavourName, CoffeeLatteArt latteArt, int tableNumber) {
		Coffee coffee = CoffeeFactory.makeCoffee(flavourName, latteArt);
		System.out.printf("Serving to table '%d'.\n", tableNumber);
		System.out.println("------------------------------------------------------");
		return new Order(coffee);
	}

	public Coffee getCoffee() {
		return coffee;
	}

}