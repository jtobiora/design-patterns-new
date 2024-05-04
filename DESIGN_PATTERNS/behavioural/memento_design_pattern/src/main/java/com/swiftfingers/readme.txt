                                              MEMENTO DESIGN PATTERN
Memento pattern is used to restore state of an object to a previous state.

Memento pattern uses three actor classes.
1. Memento:
  contains state of an object to be restored. It is the object that is going to maintain the state of originator.
2. Originator:
  creates and stores states in Memento objects. It is the object for which the state is to be saved and restored. It
  creates the memento and uses it in future to undo.
3. Caretaker:
  Caretaker is the helper class that is responsible for storing and restoring the Originator’s state through Memento
  object. It is responsible to restore object state from Memento. CareTaker is used to save and retrieve the memento
  objects which represent the state of the Originator object.

The Memento pattern is useful when you need to provide an undo mechanism in your applications, when the internal state of
an object may need to be restored at a later stage. For example, a desktop word processing application should allow users
undo their operation while an enterprise e-commerce application might require allowing a user to revert back a checkout
process comprising of multiple steps to an earlier step. The Memento Pattern is there to address such requirements
without violating encapsulation.

When using the Memento Pattern, you have an object, called the Originator whose state (or even its partial state)
needs to be saved. You then create another object, called the Memento which will hold different states of the
Originator. Therefore the Memento class needs to have the same properties as the Originator in order to save the state.
But if the Originator has its properties as private fields, then they won’t be accessible outside the Originator. This
means the Memento object cannot access the private fields? The solution to this problem is the is core to the Memento
Pattern. By applying the Memento Pattern, the Originator object will be able to:

a. Create a Memento object with the current state of the Originator object. The Originator will update the Memento
  object whenever it’s state changes and it deems it necessary to save the changed state.
b. Restore its previous state from a Memento object. By separating the logic of saving an object state from the object
  (Originator) itself, the Memento pattern adheres to the Single Responsibility principle.

It is only the Originator that can store and retrieve state information from the Memento.

We have an Originator object that will create different Memento objects to hold it’s current state as it’s state changes.
But how will you manage the Memento objects? This is where the Caretaker object comes into play. The purpose of the
Caretaker object is the safekeeping of Memento objects. It is equally important that the Caretaker object never modifies
the state of the Memento object. This modification would ripple back to the Originator object, and would be a violation
of encapsulation.
