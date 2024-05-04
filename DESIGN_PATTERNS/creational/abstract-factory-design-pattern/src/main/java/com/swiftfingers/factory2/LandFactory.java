package com.swiftfingers.factory2;

public class LandFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Elephant();
    }
}
