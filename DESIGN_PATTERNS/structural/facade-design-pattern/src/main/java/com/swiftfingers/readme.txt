                          FACADE DESIGN PATTERN
Facade design pattern is used to help client applications to easily interact with the system. The Facade design pattern
only hides the complexity of the subsystems from external systems and clients and presents a simple interface.
An example is when we connect to a database, a lot of things happen under the hood but we are not made to be concerned about
them We just have a simple call to make connection to the database. The same thing happens when we start a computer system.
When we have to start a computer, all we have to do is press the start button. We really do not care about all the things
that go inside the computer hardware and software. The same applies in starting a vehicle; all the complexities required
are hidden from us and we are given a simple interface to interact with the system.

The Facade do not encapsulate the subsystem classes or interfaces; it just provides a simplified interface to their
functionality. A client can access these classes directly. It still exposes the full functionality of the system for the
clients who may need it.
Clients communicate with the subsystem by sending requests to Facade, which forwards them to the appropriate subsystem
object(s).