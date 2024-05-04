                                           BUILDER DESIGN PATTERN

You can use the builder design pattern:
a. When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.
b. When an increase in the number of constructor parameters leads to a large list of constructors.
c. When client expects different representations for the object that’s constructed.

The builder pattern allows you to enforce a step-by-step process to construct a complex object as a finished product.
In this pattern, the step-by-step construction process remains same but the finished products can have different
representations. In the context of the house building example, the step-by-step process includes the steps to create
the foundation, structure, and roof followed by the steps to paint and furnish a house and these steps remain the same
irrespective of the type of house to build. The finished product, which is a house, can have different representations.
That is, it can be a concrete house, a prefabricated house, or a tree house.

/*Builder pattern solves the issue with large number of optional parameters in passing to constructors
The steps involved are the following:

* 1. First of all you need to create a static nested class and then copy all the arguments from the outer class
* to the Builder class. We should follow the naming convention and if the class name is User then builder
* class should be named as UserBuilder.
*
* 2. Java Builder class should have a public constructor with all the required attributes as parameters.
*
* 3. Java Builder class should have methods to set the optional parameters and it should return the same Builder
* object after setting the optional attribute.
*
* 4. The final step is to provide a build() method in the builder class that will return the Object needed by
* client program. For this we need to have a private constructor in the Class with Builder class as argument.
*
* 5. The outer class should have no public constructor and no setter methods. So the only way to get it is using the
*  nested builder class
* */