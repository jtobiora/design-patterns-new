package com.swiftfingers.carsystem;

public class TestFacadeDesignPattern {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();
        facade.startEngine();
        facade.stopEngine();
    }
}
