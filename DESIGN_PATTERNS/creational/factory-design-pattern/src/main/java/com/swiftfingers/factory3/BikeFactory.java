package com.swiftfingers.factory3;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }

}