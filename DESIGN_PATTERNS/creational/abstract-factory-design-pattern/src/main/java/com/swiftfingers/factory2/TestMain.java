package com.swiftfingers.factory2;

public class TestMain {
    public static void main(String args[]){
        new Wonderland(createAnimalFactory("water"));
    }

    public static AnimalFactory createAnimalFactory(String type){
        if("water".equals(type))
            return new SeaFactory();
        else
            return new LandFactory();
    }
}

class Wonderland {
    public Wonderland(AnimalFactory factory) {
        Animal animal = factory.createAnimal();
        animal.breathe();
    }
}