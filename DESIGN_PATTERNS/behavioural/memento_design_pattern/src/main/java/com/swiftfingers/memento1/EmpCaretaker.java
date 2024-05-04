package com.swiftfingers.memento1;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {


    final Deque<EmpMemento> mementos = new ArrayDeque<>();

    //removes and returns the first EmpMemento of this deque.
    public EmpMemento getMemento() {

        EmpMemento empMemento= mementos.pop();
        return empMemento;
    }

    //object to be pushed at the head of this deque
    public void addMemento(EmpMemento memento) {
        mementos.push(memento);

    }
}
