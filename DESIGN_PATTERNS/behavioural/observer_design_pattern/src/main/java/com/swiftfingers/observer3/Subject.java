package com.swiftfingers.observer3;

public interface Subject {
    /*
    * Used to subscribe observers or we can say register the observers so that if there is a change
    * in the state of the subject, all these observers should get notified
    **/
    public void subscribeObserver(Observer observer);

    /*
    * Used to unsubscribe observers so that if there is a change in the state of the subject, this
    * unsubscribed observer should not get notified.
    **/
    public void unSubscribeObserver(Observer observer);

    /*
     Notifies the registered observers when there is a change in the state of the subject.
    **/
    public void notifyObservers();


    public String subjectDetails();
}
