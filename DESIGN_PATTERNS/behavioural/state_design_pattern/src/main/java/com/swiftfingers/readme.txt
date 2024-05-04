                                          STATE DESIGN PATTERN
State design pattern is used when an Object changes its behavior based on its internal state. If we have to change
behavior of an object based on its state, we can have a state variable in the Object and use if-else condition block to
perform different actions based on the state. State pattern is used to provide a systematic and lose-coupled way to
achieve this through Context and State implementations.

Usually, there shall be a separate concrete class per possible state of an object. In any application, when we are
dealing with an object which can be in different states during it’s life-cycle and how it processes incoming requests
(or make state transitions) based on it’s present state – we can use the state pattern. If we do not use the state
pattern in such case, we will end up having lots of if-else statements which make the code base ugly, unnecessarily
complex and hard to maintain.

This Design pattern is used to separate action that needs to be taken at different states. There is an object
which stores the application state, rather than a combination of variables.
To illustrate what problem this design pattern solves, let’s start with a simple example: a TV remote controller.
The TV remote controller’s power button exhibits different behavior depending on whether or not the TV is
switched on (its state). If the TV is already switched on, pressing the power button will cause it to switch
off. If the TV is switched off, then pressing the same power button will cause it to switch on.

The State design pattern falls under the behavioral design pattern category. It allows an object to change its
behavior by encapsulating different states into separate classes. Each state class represents a specific
behavior associated with the object’s internal state. The pattern promotes loose coupling, improves code
readability, and simplifies the management of complex conditional statements.

Key Features of the State Design Pattern:
1. Context: The context represents the object whose behavior changes based on its internal state. It maintains
a reference to the current state object and delegates behavior to it.
2. State: The state interface or abstract class defines the common methods that encapsulate the behavior
associated with a specific state. It typically declares methods for performing operations based on the state.
3. Concrete States: Concrete state classes implement the state interface or extend the state abstract class.
Each concrete state encapsulates the behavior associated with a specific state of the context object.
4. Client: The client code interacts with the context object and triggers state transitions based on certain
conditions or events.
