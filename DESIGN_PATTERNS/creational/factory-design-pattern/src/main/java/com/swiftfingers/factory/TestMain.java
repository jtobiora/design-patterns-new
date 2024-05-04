package com.swiftfingers.factory;

/*
* The factory method allows us define an interface for creating an object, but let subclasses decide which
* class to instantiate. The Factory method allows a class to defer instantiation to subclasses.
* The Factory method is for creating objects. A superclass specifies all standard and generic behavior and then delegates
* the creation details to subclasses that are supplied by the client
* */
public class TestMain {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getInstance(ShapeFactory.Shapes.CIRCLE);

        s.draw();
    }
}
