                   STATE DESIGN PATTERN example
To illustrate the use of the State Design Pattern, let us help a company which is looking to build a robot for cooking.
The company wants a simple robot that can simply walk and cook. A user can operate a robot using a set of commands via
remote control. Currently, a robot can do three things, it can walk, cook, or can be switched off.
The company has set protocols to define the functionality of the robot. If a robot is in "on" state you can command it to
walk. If asked to cook, the state would change to "cook" or if set to "off", it will be switched off.
Similarly, when in "cook" state it can walk or cook, but cannot be switched off. And finally, when in "off" state it will
automatically get on and walk when the user commands it to walk but cannot cook in off state. This might look like an easy
implementation: a robot class with a set of methods like walk, cook, off, and states like on, cook, and off. We can use
if-else branches or switch to implement the protocols set by the company. But too much if-else or switch
statements will create a maintenance nightmare as complexity might increase in the future.