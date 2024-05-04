                                           COMPOSITE DESIGN PATTERN
Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects
in terms of a tree structure to represent part as well as whole hierarchy.

This pattern is most suitable in cases where you need to work with objects which form a tree like hierarchy. In that tree, each node/object
(except root node) is either composite or leaf node. Implementing the composite pattern lets clients treat individual objects and
compositions uniformly.

A system consists of subsystems or components. Components can further be divided into smaller components. Further smaller components can be
divided into smaller elements. This is a part-whole hierarchy. And this is where composite design pattern comes into play.
Everything around us can be a candidate for part-whole hierarchy. Human body, a car, a computer, etc. A car is made up of
engine, tyre, … Engine is made up of electrical components, valves, … Electrical components is made up of chips, transistor, … Like this a
component is part of a whole system. This hierarchy can be represented as a tree structure using composite design pattern.

The elements in a composite design pattern are the following:

1. Base Component class:
 A base component class in a composite design pattern is the class that actually implements the core object or the parent object for succeeding
 class. For instance, an Airways class, a Vehicle class, a Shape are also generic classes which will be then implemented by related
 sub classes. The base component class provides an abstract layer of functionalities required by the implementing subclasses. These subclasses
 will then have similar functionalities as their parent classes plus the features specific to themselves.
 The primary reason for creating this base component class is not only to provide common functionalities to the implementing classes but
 also to allow the final composite class to utilise the Leaf classes in a single collection.

2. Leaf classes:
 A leaf class is the class implementing the base component classes. The leaf classes are normally sub classes that will be later used in the
 composite classes in the form of collection or individual objects. For instance a TwoWheeler, a Rectangle, a Cone could be a leaf class
 where the Vehicle or the Shape class will be base component classes respectively. These leaf classes tend to implement a common behaviour
 i.e a common interface called the base component class. This interface is then used to generalise the behaviour of leaf classes in the
 composite classes. Leaf means that it has no objects below it.

3. Composite class:
 A composite class is the class utilising the leaf classes using its base class for the definition. Composite class stores child components and
 implements child related operations in the component interface. Composite means that it can have other objects below it.

4. Client class:
  A client class could be a class utilising composite class objects directly.
