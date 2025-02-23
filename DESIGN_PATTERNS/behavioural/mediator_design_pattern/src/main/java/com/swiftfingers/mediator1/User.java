package com.swiftfingers.mediator1;

import com.swiftfingers.mediator1.ChatMediator;

//         Colleague Interface
//User has a reference to the mediator object, it’s required for the communication between different users.
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
