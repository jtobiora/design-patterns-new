
                                MEMENTO DESIGN PATTERN
To illustrate the use of the Memento Pattern, let’s see an example. We will create a class that will contain two double
type fields and we will run some mathematical operations on it. We will provide users with the undo operation. If the
results after some operations are not satisfied to a user, the user can call the undo operation which will restore the
state of the object to the last saved point.

The example also includes a save point mechanism which is used by the user to save the state of the object. We will also
provide a variety of undo operations. A simple undo would restore the object state to the previous save point. An undo
with the specified save point will restore that particular state of the object and undo all will delete all the saved
state of the object and restore the object in the initialized state, when the object was created.