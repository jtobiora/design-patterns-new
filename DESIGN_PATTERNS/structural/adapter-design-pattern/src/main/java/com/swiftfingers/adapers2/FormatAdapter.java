package com.swiftfingers.adapers2;


/*
* Here, we want to use VLC and MP4 instances as MediaPlayer instances. So, we need an adapter.
*  a. We just need to implement the Target interface
*  b. Then add a dependency of the Adaptee to the Adapter
*  c. Then call the methods on the Adaptee
* */
public class FormatAdapter implements MediaPlayer {
    private AdvancedMediaPlayer media;
    public FormatAdapter(AdvancedMediaPlayer m) {
        media = m;
    }

    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }

}