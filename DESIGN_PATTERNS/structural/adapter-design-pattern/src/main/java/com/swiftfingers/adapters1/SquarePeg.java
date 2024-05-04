package com.swiftfingers.adapters1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SquarePeg {
    private double width;

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}