package com.swiftfingers.factory3;

public class Dealer {

    public static void main(String args[]) {
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory carFactory = new CarFactory();

        Vehicle bike = bikeFactory.assembleVehicle();
        Vehicle car = carFactory.assembleVehicle();

        if (bike instanceof Bike) {
            System.out.println("Bike object retrieved");
        }

        if (car instanceof Car) {
            System.out.println("Car object retrieved");
        }
    }

}