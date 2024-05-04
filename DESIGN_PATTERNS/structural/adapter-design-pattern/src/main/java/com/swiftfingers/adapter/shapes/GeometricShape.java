package com.swiftfingers.adapter.shapes;

// Part of Extra-Geometric-Shape API like a Thirdparty API we need to use in our Drawing
//It is called an Adaptee — This defines an existing interface that needs adapting i.e one we need to
//work with
public interface GeometricShape {

    double area();
    double perimeter();
    void drawShape();

}