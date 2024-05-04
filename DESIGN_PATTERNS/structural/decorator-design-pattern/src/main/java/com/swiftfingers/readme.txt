                                    DECORATOR DESIGN PATTERN
The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the
behavior of other existing objects in the same class.

Decorator design patterns allow us to add functionality to an object (not the class) at runtime. Decorator patterns
allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the
original class.

We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable
to all the instances of the class. We can’t add any new functionality of remove any existing behavior at
runtime – this is when Decorator pattern comes into picture.

The intent of the Decorator Design Pattern is to attach additional responsibilities to an object dynamically. Decorators
provide a flexible alternative to sub-classing for extending functionality.

The Decorator Pattern is used to extend the functionality of an object dynamically without having to change the original
class source or using inheritance. This is accomplished by creating an object wrapper referred to as a Decorator around
the actual object.

The Decorator object is designed to have the same interface as the underlying object. This allows a client object to
interact with the Decorator object in exactly the same manner as it would with the underlying actual object. The
Decorator object contains a reference to the actual object. The Decorator object receives all requests (calls) from a
client. In turn, it forwards these calls to the underlying object. The Decorator object adds some additional
functionality before or after forwarding requests to the underlying object. This ensures that the additional
functionality can be added to a given object externally at runtime without modifying its structure. Decorator
prevents the proliferation of subclasses leading to less complexity and confusion.

The following points are to be noted;
a. Decorators have the same supertype as the objects they decorate.
b. You can use one or more decorators to wrap an object.
c. Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated object
   in place of the original (wrapped) object.
d. The decorator adds its own behavior either before and/or after delegating to the object it
   decorates to do the rest of the job.
e. Objects can be decorated at any time, so we can decorate objects dynamically at runtime
   with as many decorators as we like.

A Decorator pattern should have the following:

1. Component:
• Defines the interface for objects that can have responsibilities added to them dynamically.

2. ConcreteComponent:
• Defines an object to which additional responsibilities can be attached.

3. Decorator:
• Maintains a reference to a Component object and defines an interface that conforms to Component’s interface.

4. ConcreteDecorator:
• Adds responsibilities to the component.