package com.swiftfingers.flyweight.without;


import com.swiftfingers.flyweight.CoffeeFlavour;
import com.swiftfingers.flyweight.CoffeeLatteArt;

public class Coffee {

	protected final CoffeeFlavour flavourName;
	protected final CoffeeLatteArt latteArt;

	protected Coffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
		super();
		this.flavourName = flavourName;
		this.latteArt = latteArt;
	}

	public CoffeeFlavour getFlavourName() {
		return flavourName;
	}

	public CoffeeLatteArt getLatteArt() {
		return latteArt;
	}

}