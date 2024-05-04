package com.swiftfingers.prototype;


/*
* This class is a concrete class that implements the Prototype interface. It overrides the clone() method
* by using the super() constructor of the superclass to create an instance of itself (cloning).
* This object is returned after cloning whenever it is needed by the client
* */
public class AccessControl implements Prototype{

    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel,String access){
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone(){
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getControlLevel(){
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

}
