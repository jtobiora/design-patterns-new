package com.swiftfingers.proxy.protection_impl.three.proxy3;

public class RealVideo implements Video {

    private String fileName;

    public RealVideo (String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }

    public void loadFromDisk (String fileName) {
        System.out.println("Loading " + fileName);
    }
}
