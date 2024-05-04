                                      STATE DESIGN PATTERN
Let’s examine the State pattern through a candy vending machine example. The requirement of the vending machine is to
roll out a candy whenever a user inserts a coin into the machine and presses a button. From this requirement, we can
see that the machine will have four states: No Coin, Contains Coin, Dispense, and No Candy. These states represent
different behavior of the machine. State transitions will move the machine from one state to another. As an example,
if the current state of the machine is No Coin, and then a user enters a coin, a state transition will move the machine
to the Contains Coin state.

A typical program to achieve this using if-else statements will follow this pattern as seen in "TypicalVendingMachine"
class. A look at the class shows that we have ended up with a monolithic class with three action methods, each with a
bunch of repeated conditional statements to handle different types of behavior of the machine – A clear violation of
the Single Responsibility principle.

Before we apply the State pattern to our candy vending machine example, we will look at the participants of the
pattern. We will define a CandyVendingMachineState class that will contain methods for every operations of the machine.
For each state of the machine we will create a separate class. These classes are responsible for defining how the
machine should behave in the state that the class represents. As we have four states, we will create four classes and
name them NoCoinState, ContainsCoinState, DispensedState, and NoCandyState.

The main points to not are:
1. State
2. Context
3. Client
