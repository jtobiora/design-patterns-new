package com.swiftfingers.adapters1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * RoundPegs are compatible with RoundHoles.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoundPeg {
    private double radius;

    public double getRadius() {
        return radius;
    }
}