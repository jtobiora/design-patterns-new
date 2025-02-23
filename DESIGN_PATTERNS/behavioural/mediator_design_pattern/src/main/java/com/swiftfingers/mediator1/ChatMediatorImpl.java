package com.swiftfingers.mediator1;

import java.util.ArrayList;
import java.util.List;

//                  Concrete Mediator class
//It has a list of users in the group and provide logic for the communication between
// the users.
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }

}