                     COMMAND DESIGN PATTERN
In this example, we create an interface 'Order' which is acting as a command. We have created a 'Stock' class
which acts as a request. We have concrete command classes 'BuyStock' and 'SellStock' implementing Order interface
which will do actual command processing. A class 'Broker' is created which acts as an invoker object. It can take
and place orders.

Broker object uses command pattern to identify which object will execute which command based on the type of command.
CommandPatternDemo, our demo class, will use Broker class to demonstrate command pattern.