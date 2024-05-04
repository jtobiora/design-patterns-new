package com.swiftfingers.factory;

public abstract class ShapeFactory {

    public enum Shapes{
        CIRCLE,RECTANGLE
    }

    //factory method
    public static Shape getInstance(Shapes s){
        Shape shape = null;
        switch (s){
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}
