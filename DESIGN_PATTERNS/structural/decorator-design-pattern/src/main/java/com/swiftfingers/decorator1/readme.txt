We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable
to all the instances of the class. We can’t add any new functionality of remove any existing behavior at runtime –
this is when Decorator pattern comes into picture.

Suppose we want to implement different kinds of cars – we can create interface Car to define the assemble method and then
we can have a Basic car, further more we can extend it to Sports car and Luxury Car.
But if we want to get a car at runtime that has both the features of sports car and luxury car, then the
implementation gets complex and if further more we want to specify which features should be added first,
it gets even more complex. Now imagine if we have ten different kind of cars, the implementation logic using
inheritance and composition will be impossible to manage. To solve this kind of programming situation, we
apply decorator pattern in java.

We need to have following types to implement decorator design pattern.

1. Component Interface:
The interface or abstract class defining the methods that will be implemented. In our case Car will be the
component interface.

2. Component Implementation –
The basic implementation of the component interface. We can have BasicCar class as our component
implementation.

3. Decorator
Decorator class implements the component interface and it has a HAS-A relationship with the component
interface. The component variable should be accessible to the child decorator classes, so we will make this
variable protected.

4. Concrete Decorators –
Extending the base decorator functionality and modifying the component behavior accordingly. We can have
concrete decorator classes as LuxuryCar and SportsCar.