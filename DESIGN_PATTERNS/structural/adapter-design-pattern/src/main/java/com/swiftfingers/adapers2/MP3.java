package com.swiftfingers.adapers2;

//This is the concrete implementation of the Target interface. This is more like what we currently have but
//we now need MP4 sounds and VLC too
public class MP3 implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
}