package com.swiftfingers.adapers2;

//This is the concrete implementation of the Adaptee
public class VLC implements AdvancedMediaPlayer {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
}