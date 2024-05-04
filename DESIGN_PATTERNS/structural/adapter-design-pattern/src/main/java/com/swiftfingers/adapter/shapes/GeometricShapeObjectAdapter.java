package com.swiftfingers.adapter.shapes;


/* In this approach, we create an adapter class that implements the target (Shape in this case -
remember that Shape is what we have with us) and references the adaptee — GeometricShape
(Geometric Shape is like a third-party API we need to consume) in this case. We implement all of
the required methods of the target (Shape) and do the necessary conversion to fulfill our
requirement.
Shape interface is what we have with us (This is the Target interface)
GeometricShape is what we want to plug into (This is the Adaptee)
*/
public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
