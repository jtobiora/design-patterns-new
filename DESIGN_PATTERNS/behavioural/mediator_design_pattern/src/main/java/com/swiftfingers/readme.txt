                                         MEDIATOR DESIGN PATTERN
The mediator design pattern is used to provide a centralized communication medium between different objects in a system.
The mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each
other. If the objects interact with each other directly, the system components are tightly coupled with each other that
makes maintainability cost higher and not flexible to extend easily. Mediator pattern focuses on to provide a mediator
between objects for communication and help in implementing lose-coupling between objects. This design pattern act as a
mediator or middleman between two communicating objects.

Air traffic controller is a great example of a mediator pattern where the airport control room works as a mediator for
communication between different flights. The mediator works as a router between objects.

Mediator Design Pattern that is widely used in various chat application(Whats App, Instagram, Facebook etc.).

Mediator design pattern permits decoupling (separation) of objects by involving a layer (Mediator) in between them so
that the interaction between objects happen via the involved layer (Mediator).In other words Mediator Design Pattern
allows multiple objects to communicate with each other’s without knowing each other’s architecture.

By using the mediator design pattern, communication between objects is encapsulated within a mediator object. Instead
of classes communicating directly with each other, classes send messages to the mediator and then the mediator send
these messages to the other classes.

Mediator Design Pattern is very simple to understand and implement in real life examples such as chatRoom, Facebook,
Air traffic control, Road traffic control etc.

The Mediator Pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling
by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
Rather than interacting directly with each other, objects ask the Mediator to interact on their behalf which results
in reusability and loose coupling.

The major participants of a Mediator Pattern are:
a. Mediator :It defines the interface for communication between colleague objects.
b. ConcreteMediator : It implements the mediator interface and coordinates communication between colleague objects.
c. Colleague : Colleague objects are the components that need to communicate with each other. They are aware of
the mediator and use it to send and receive messages.
d. ConcreteColleague : Concrete colleague classes represent the actual components that participate in
communication. They implement the colleague interface and communicate through the mediator.

The chat application is an example of the mediator pattern. In a chat application we can have several participants.
It's not a good idea to connect each participant to all the others because the number of connections would be really
 high, there would be technical problems due to proxies and firewalls, etc... . The most appropriate solution is to
 have a hub where all participants will connect; this hub is just the mediator class.

Participants:
1. Chatroom(Mediator) - Defines the interface for interacting with participants
2. ChatroomImpl (ConcreteMediator) - implements the operations defined by the Chatroom interface. The operations are
 managing the interactions between the objects: when one participant sends a message, the message is sent to the other
 participants.
3. Participant(Colleague) - defines an interface for the participants.
4. HumanParticipant, Bot (ConcreteColleague) - implements participants; the participant can be a human or a bot, each one
 having a distinct implementation but implementing the same interface. Each participant will keep only a reference to
 the mediator.

 For our example, we will try to implement a chat application where users can do group chat. Every user will be
 identified by it’s name and they can send and receive messages. The message sent by any user should be received by all
 the other users in the group.