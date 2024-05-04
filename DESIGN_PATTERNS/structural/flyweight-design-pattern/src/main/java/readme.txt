                                      FLYWEIGHT DESIGN PATTERN
Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes memory
space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern
can be applied to reduce the load on memory by sharing objects.
The Flyweight pattern has a single purpose: minimizing memory intake. If your program doesn’t struggle with a shortage
of RAM, then you might just ignore this pattern for a while. Flyweight can be recognized by a creational method
that returns cached objects instead of creating new.

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase
performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object
count thus improving the object structure of application.

Before we apply flyweight design pattern, we need to consider following factors:
a. The number of Objects to be created by application should be huge.
b. The object creation is heavy on memory and it can be time consuming too.
c. The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object
should be defined by the client program.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no
matching object is found.

The main elements of the pattern are:
1. An interface which defines the operations that the client code can perform on the flyweight object
2. One or more concrete implementations of our interface
3. Factory to handle objects instantiation and caching