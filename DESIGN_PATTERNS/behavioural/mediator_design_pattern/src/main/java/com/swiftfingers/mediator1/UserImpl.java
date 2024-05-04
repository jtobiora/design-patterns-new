package com.swiftfingers.mediator1;


import com.swiftfingers.mediator1.ChatMediator;
import com.swiftfingers.mediator1.User;

//             Concrete Colleague
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

// send() method is using mediator to send the message to the users and it has no idea how it will be handled by
// the mediator.
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }

}
