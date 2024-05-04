package com.swiftfingers.adapers2;

//This is the Client. So now we have succeeded in playing MP4 and VLC using MP3 instance. This was possible
//because of Adapter
//An Adapter is also called a Wrapper class because it wraps the instance of the Adaptee
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }
}
