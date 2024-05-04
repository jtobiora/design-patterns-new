                                       OBSERVER DESIGN PATTERN
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its
dependent objects are to to be notified automatically.

The key objects in this pattern are subject and observer. A subject may have any number of dependent observers. All
observers are notified whenever the subject undergoes a change in its state.

The other way to understand the Observer Pattern is the way Publisher-Subscriber relationship works. Let’s assume for
example that you subscribe to a magazine for your favorite sports or fashion magazine. Whenever a new issue is published,
it gets delivered to you. If you unsubscribe from it when you don’t want the magazine anymore, it will not get delivered
to you. But the publisher continues to work as before, since there are other people who are also subscribed to that
particular magazine.

Note the following:
1.Subject:
  It is considered as the keeper of information, of data or of some business logic.
2. Register/Attach:
  Observers register themselves to the subject because they want to be notified when there is a change.
3. Notify:
  Depending on the implementation, the subject may 'push' inforamtion to the observers, or the observers may pull if they
  need information from the subject.
4. Event:
  Events act as a trigger in the subject such that all the observers are notified.
5. Update:
  Observers update their state independently from the other observers however theri state might change depending on the
  triggered event.

  There are four participants in this design pattern:
• Subject: which is used to register observers. Objects use this interface to register as observers and also to remove
 themselves from being observers.
• ConcreteSubject: stores the state of interest to ConcreteObserver objects. It sends a notification to its observers
  when its state changes. A concrete subject always implements the Subject interface.
• Observer: defines an updating interface for objects that should be notified of changes in a subject. All observers
    need to implement the Observer interface.
• ConcreateObserver: maintains a reference to a ConcreteSubject object and implements the Observer interface. Each
  observer registers with a concrete subject to receive updates.