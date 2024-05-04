package com.swiftfingers.mediator1;


//        Mediator Interface
// Mediator interface that will define the contract for concrete mediators.
public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}
