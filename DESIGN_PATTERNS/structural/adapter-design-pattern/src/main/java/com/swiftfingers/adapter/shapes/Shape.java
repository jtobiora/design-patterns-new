package com.swiftfingers.adapter.shapes;


/*Target — This defines the domain-specific interface that the client uses. This is the Shape
interface in our example. This is more like the interface that already exists with the team
of developers*/

public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}