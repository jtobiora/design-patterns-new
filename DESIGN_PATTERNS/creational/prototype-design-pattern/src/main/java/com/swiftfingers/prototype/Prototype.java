package com.swiftfingers.prototype;


/*
* Provides a generic interface for objects to be cloned
* This interface is implemented by classes which want to create a prototype object.
*
* Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and
* resources and you have a similar object already existing. So this pattern provides a mechanism to copy the
* original object to a new object and then modify it according to our needs. This pattern uses java cloning to
* copy the object.
* **/
public interface Prototype extends Cloneable {

    AccessControl clone() throws CloneNotSupportedException;

}
