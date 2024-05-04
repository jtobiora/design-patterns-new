                             MEMENTO DESIGN PATTERN
Consider an employee management application which a user of the HR department uses to enter employee details when a new
employee joins. The process is long and divided into multiple steps. It starts with storing basic information of the
employee, and continues to recording previous working history of the employee. Imagine, if the user makes an error during
the process and finds it in the last step of the process. It would be a poor user experience to force the user to start
over. We need to allow the user to undo the steps and work backward to correct the error.

By applying the Memento pattern, we will create a EmpOriginator class, which is object we wish to save the state of. We
will then create an EmpMemento class which will represent the different states of the EmpOriginator object. Finally,
we will create the EmpCaretaker class which will manage the EmpMemento objects.

In summary, there are the objects we will be creating to implement the Memento Pattern:

1. Originator (EmpOriginator): Is a class the state of whose object needs to be saved. It creates a Memento containing
 a snapshot of its current state. Originator uses the Memento to restore back its state.
2. Memento (EmpMemento): Is a class whose objects stores states of the Originator. Memento denies other objects access
  to itself except the Originator.
3. Caretaker (EmpCaretaker): Manages and safeguards Memento.