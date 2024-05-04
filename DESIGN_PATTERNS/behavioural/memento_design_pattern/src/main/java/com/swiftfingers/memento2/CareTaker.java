package com.swiftfingers.memento2;

import java.util.HashMap;
import java.util.Map;


/*
* This class is used to store and provide the requested memento object.
* */
public class CareTaker {
    private final Map<String, Memento> savepointStorage = new HashMap<String, Memento>();

    //Used to save the memento object
    public void saveMemento(Memento memento,String savepointName){
        System.out.println("Saving state..."+savepointName);
        savepointStorage.put(savepointName, memento);
    }

    //Used to return the requested memento object
    public Memento getMemento(String savepointName){
        System.out.println("Undo at ..."+savepointName);
        return savepointStorage.get(savepointName);
    }

    //used to clear all the savepoints and it deletes all the saved memento objects
    public void clearSavepoints(){
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }
}
