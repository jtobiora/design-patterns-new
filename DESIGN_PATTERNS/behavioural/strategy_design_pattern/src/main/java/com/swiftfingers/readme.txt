                                              STRATEGY DESIGN PATTERN
Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation
to be used at runtime. We define multiple algorithms and let client application pass the algorithm to be used as a
parameter.
The Strategy Design Pattern is a behavioral design pattern. It allows you to dynamically change the behavior
of an object by encapsulating it into different strategies.
This pattern enables an object to choose from multiple algorithms and behaviors at runtime, rather than
statically choosing a single one.

Use this pattern when a class defines many behaviors, and these appear as multiple conditional statements in its
operations. Instead of many conditionals, move related conditional branches into their own Strategy class.

The Strategy pattern is to be used where you want to choose the algorithm to use at runtime. A good use of the Strategy
pattern would be saving files in different formats, running various sorting algorithms, or file compression.

For instance,a file compression class can support different compression algorithm, such as ZIP, GZIP, LZ4, or even a
custom compression algorithm. Another example can be a data encryption class that encrypts data using different
encryption algorithms, such as AES, TripleDES, and Blowfish. Typically, programmers tend to bundle all the algorithm
logic in the host class, resulting in a monolithic class with multiple switch case or conditional statements.
Using the Strategy pattern, we define a set of related algorithm and encapsulate them in classes separated from the host
class. Clients can choose the algorithm to use at run time. By doing so, we can easily add a new algorithm or remove an
existing one without modifying the other existing algorithms or the host class.

The Strategy pattern is useful when there is a set of related algorithms and a client object needs to be able to
dynamically pick and choose an algorithm from this set that suits its current need. The Strategy pattern suggests keeping
the implementation of each of the algorithms in a separate class. Each such algorithm encapsulated in a separate class
is referred to as a strategy. An object that uses a Strategy object is often referred to as a context object.

It is based on the principle of composition over inheritance. It defines a family of algorithms, encapsulates
each one, and makes them interchangeable at runtime. The core idea behind this pattern is to separate the
algorithms from the main object. This allows the object to delegate the algorithm's behavior to one of its
contained strategies.

In simpler terms, the Strategy Design Pattern provides a way to extract the behavior of an object into
separate classes that can be swapped in and out at runtime. This enables the object to be more flexible and
reusable, as different strategies can be easily added or modified without changing the object's core code.


Participants of the Strategy Design Pattern

• Strategy:
  The interface that defines the behavior for all strategies. The strategies implement this interface to
  provide their unique implementation of the behavior.

• ConcreteStrategy:
  The classes that implement the Strategy Interface. Each strategy encapsulates a specific behavior that the
  context can switch to at runtime.

• Context:
   The object that will delegate its behavior to one of the contained strategies. The context maintains a
   reference to a strategy object and interacts with it through a common interface.


To implement the Strategy Design Pattern in Java, follow these steps:

1. Identify the algorithm or behavior that needs to be encapsulated and made interchangeable.
2. Define an interface that represents the behavior, with a single method signature that takes in any required parameters.
3. Implement concrete classes that provide specific implementations of the behavior defined in the interface.
4. Define a context class that holds a reference to the interface and calls its method when needed.
5. Modify the context class to allow for the dynamic swapping of the concrete implementations at runtime.
