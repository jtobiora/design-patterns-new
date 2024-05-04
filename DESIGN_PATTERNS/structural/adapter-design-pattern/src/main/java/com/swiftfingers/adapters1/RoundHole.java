package com.swiftfingers.adapters1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * RoundHoles are compatible with RoundPegs.
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoundHole {
    private double radius;

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}