package com.swiftfingers.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
