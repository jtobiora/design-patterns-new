package com.swiftfingers.observer1;


public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyUpdate(Message m);
}