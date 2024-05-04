package com.swiftfingers.adapers2;


//This is the Adaptee - it has concrete implementations that can play VLC and MP4 which the Client needs
public interface AdvancedMediaPlayer {
    void playFile(String filename);
}
