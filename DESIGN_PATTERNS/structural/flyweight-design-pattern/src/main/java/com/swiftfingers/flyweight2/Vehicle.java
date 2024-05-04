package com.swiftfingers.flyweight2;
import java.awt.Color;
public interface Vehicle {

    /**
     * Starts the vehicle.
     */
    public void start();

    /**
     * Stops the vehicle.
     */
    public void stop();

    /**
     * Gets the color of the vehicle.
     *
     * @return the color of the vehicle
     */
    public Color getColor();

}