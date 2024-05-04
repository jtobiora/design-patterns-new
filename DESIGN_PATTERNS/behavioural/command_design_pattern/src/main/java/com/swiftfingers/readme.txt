                                      COMMAND DESIGN PATTERN
Communication between objects in enterprise applications starts from an object sending a request to another object. The
The object receiving the request can either process the request and send back a response or forward the request to
another object for processing. Typically requests are made by the invoker (the object making the request) through
method calls on the object that processes the request, which we will refer as the receiver. As a result, the
invoker and the receiver are tightly coupled. This violates the SOLID design principles that advocates loosely
coupled components to ensure that changes made to one component does not affect the other components of the
application.

The command design pattern is used to separate a request for an action from the object which actually performs
the action. This pattern states that requests should be encapsulated as objects that like any other objects can
be stored and passed around the application. Requests encapsulated as objects are known as commands.

In the command pattern, the invoker issues commands without knowing anything about the receiver. In fact the
invoker issuing the command doesn’t even know what operation will be carried out on issuing a command.

Simply put, this pattern intends to encapsulate in an object all the data required for performing a given
action(command), including what method to call, the method’s arguments, and the object to which the method
belongs.

This model allows us to decouple objects that produce the commands from their consumers, so that’s why the pattern
is commonly known as the producer-consumer pattern.

A sender is an object that invokes an operation, and a receiver is an object that receives the request to
execute a certain operation. With decoupling, the sender has no knowledge of the Receiver's interface. The
term request here refers to the command that is to be executed. The Command pattern also allows us to vary when
and how a request is fulfilled. The Command pattern turns the request itself into an object. This object can be
stored and passed around like other objects.

The following terms are common with the Command Design Pattern in Java:
1. Command:
 This declares a common interface that will be implemented by all Concrete Commands. At a minimum, it must
 declare one method to execute the actual action.

2. Concrete Command
 This class performs actual operation or command. It extends the Command interface and implements the
 appropriate method for execution on a receiver.

3. Client
 The client has the responsibility to create Concrete Command. The command then passed on to Invoker.

4. Invoker
 As the name suggests, these are only to invoke actual execute operation or action. These classes get a
 pre-created concrete commands object from the client.

5. Receiver
 These hold the business logic to carry out a command or operation.