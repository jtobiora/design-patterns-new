package com.swiftfingers.adapter.shapes;

import java.util.ArrayList;
import java.util.List;

//OurDrawing client class can work only with Shape  and not GeometricShape.
// This makes GeometricShape  incompatible with our Drawing class. So we have to use an Adapter to make
//using it possible
public class Drawing {

    List<Shape> shapes = new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<Shape>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}