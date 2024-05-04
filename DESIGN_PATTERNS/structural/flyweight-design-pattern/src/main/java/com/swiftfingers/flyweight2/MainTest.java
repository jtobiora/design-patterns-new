package com.swiftfingers.flyweight2;

import java.awt.*;

public class MainTest {
    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle v2 = VehicleFactory.createVehicle(Color.BLACK);


        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

    }
}
