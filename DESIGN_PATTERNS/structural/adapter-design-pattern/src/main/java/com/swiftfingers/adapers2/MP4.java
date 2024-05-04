package com.swiftfingers.adapers2;


//This is the concrete implementation of the Adaptee
public class MP4 implements AdvancedMediaPlayer {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
}