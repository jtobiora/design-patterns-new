                            MEDIATOR DESIGN PATTERN
The Mediator pattern says that instead of allowing a set of objects to directly interact between them, define an
object (mediator) that will handle the interactions. What the mediator essentially says to such set of objects is
“talk with me instead of talking among yourselves”. This figure conceptually shows how objects interact without and with
a mediator.

Participants in a Mediator Pattern
Imagine a war zone where armed units are moving into the enemy’s territory. Armed units can include soldier, tank,
grenadier, and sniper units. The strategy being employed is that whenever one unit attacks, other units should stop
attacking and take cover. To do so, the unit that is currently attacking needs to notify the other units.

In the programming world, you can easily model this requirement by creating classes for each armed unit. In each class,
whenever its object is about to start attacking, you can implement the logic to notify objects of the other classes.
Now, imagine that a new unit joins in. The consequence – all the existing classes need to be updated. In the worst
case, imagine that the battle tactics change so that both the soldier and sniper units can now attack simultaneously.
Again, the consequence is a lot of changes to the code base. We can address such challenges, similarly as done in real
life. Place a Commander in a base camp that will act as the Mediator. All units, instead of communicating between
themselves will communicate with the Mediator. The Mediator based on the notifications received from some units can
send request to one or more other units to perform actions as requirements demand.

Let’s model the mediator with a Commander interface and a concrete CommanderImpl subclass of the interface. In the
Commander interface, we can declare methods to send messages to objects representing armed units and also methods that
armed unit’s objects can communicate with the Commander. In the CommanderImpl subclass, we will maintain reference to
the objects representing armed units and override the methods of Commander. For our example, let’s create an interface
as ArmedUnit whose implementing classes will represent specific armed units. We will create two such concrete classes:
SoldierUnit and TankUnit, and each of them will hold references to Commander.

1. Mediator (Commander): Is an interface that declares methods for communicating with Colleague objects.
2. ConcreteMediator (CommanderImpl): Implements Mediator. This class maintains and coordinates Colleague objects.
3. Colleague(SoldierUnit and TankUnit): Communicates with its Mediator when their state changes and responds to requests
 from the Mediator.