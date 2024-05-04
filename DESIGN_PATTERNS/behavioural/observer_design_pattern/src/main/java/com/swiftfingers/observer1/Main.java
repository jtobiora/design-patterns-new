package com.swiftfingers.observer1;

public class Main {
    public static void main(String[] args) {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        p.register(s1);
        p.register(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.unregister(s1);
        p.register(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
