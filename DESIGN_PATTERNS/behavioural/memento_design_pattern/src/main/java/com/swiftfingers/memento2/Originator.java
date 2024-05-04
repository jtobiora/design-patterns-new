package com.swiftfingers.memento2;

public class Originator {
    private double x;
    private double y;

    //is used to store the key name of last saved memento in order to implement the undo operation.
    private String lastUndoSavepoint;

    //CareTaker is used to save and retrieve the memento objects
    //which represent the state of the Originator object.
    CareTaker careTaker;

    //saved the initial state of the object using createSavepoint() method
    public Originator(double x, double y,CareTaker careTaker){
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavepoint("INITIAL");
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void createSavepoint(String savepointName){
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }

    //restores the last saved state
    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    //restores the state saved with that particular savepoint name.
    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    //asks the care taker to clear all the savepoints and set it to the initial state
    // (the state at the time of the creation of the object).
    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }
    private void setOriginatorState(String savepointName){
        Memento mem = careTaker.getMemento(savepointName);
        this.x = mem.getX();
        this.y = mem.getY();
    }
    @Override
    public String toString(){
        return "X: "+x+", Y: "+y;
    }
}
