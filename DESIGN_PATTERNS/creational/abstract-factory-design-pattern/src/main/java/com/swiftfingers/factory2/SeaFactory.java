package com.swiftfingers.factory2;

public class SeaFactory implements AnimalFactory {

    public Animal createAnimal() {
        return new Shark();
    }

}
