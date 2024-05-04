                                    TEMPLATE METHOD DESIGN PATTERN
The Template Pattern defines the skeleton of an algorithm in an method, deferring some steps to subclasses. Template
Method lets subclasses to redefine certain steps of an algorithm without changing the algorithm’s structure.
The Template Method pattern can be used in situations when there is an algorithm, some steps of which could be implemented
in multiple different ways. In such scenarios, the Template Method pattern suggests keeping the outline of the algorithm
in a separate method referred to as a template method inside a class, which may be referred to as a template class,
leaving out the specific implementations of the variant portions (steps that can be implemented in multiple different ways)
of the algorithm to different subclasses of this class.

The template method design pattern shall define an algorithm as an operational skeleton and leave the details for the
child classes. And parent class preserves the overall structure and sequence of the algorithm.

Some points worth noting are the following:
a. Template method should consist of certain steps whose order is fixed and for some of the methods, implementation
 differs from base class to subclass.
b. Most of the times, subclasses calls methods from super class but in template pattern, superclass template method calls
 methods from subclasses.

 When broken down, there are four different types of methods used in the parent class:

1. Concrete methods:
 Standard complete methods that are useful to the subclasses. These methods are usually utility methods.
2. Abstract methods:
 Methods containing no implementation that must be implemented in subclasses.
3. Hook methods:
 Methods containing a default implementation that may be overidden in some classes. Hook methods are intended to be
 overridden, concrete methods are not.
4. Template methods:
 A method that calls any of the methods listed above in order to describe the algorithm without needing to implement the
 details. The template method is usually made final so that it cannot be overriden.

An example will suffice here:
There are steps or algorithm required to connect to a relational database in any Java application. Let’s recall some
important steps which are required to connect and insert data into the database. First, we need a driver according to
the database we want to connect with. Then, we pass some credentials to the database, then, we prepare a statement, set
data into the insert statement and insert it using the insert command. Later, we close all the connections, and
optionally destroy all the connection objects.

The algorithm will always remain the same i.e you need to write all these steps regardless of any vendor’s relational
database. Consider a problem where you need to insert some data into the different databases. You need to fetch some
data from a CSV file and have to insert it into a MySQL database. Some data comes from a text file and which should be
inserted into an Oracle database. The only difference is the driver and the data, the rest of the steps should be the
same, as JDBC provides a common set of interfaces to communicate to any vendor’s specific relation database.
We can create a template, which will perform some steps for the client, and we will leave some steps to let the client
to implement them in its own specific way. Optionally, a client can override the default behavior of some already
defined steps.