package com.swiftfingers.proxy.protection_impl.three.proxy3;

public class Main {
    public static void main(String[] args) {
        Video video = new ProxyVideo("test_video.mp4");
        //video will be loaded from the disk
        video.display();
        System.out.println("-------------------------------------------------------------------------");

        //video will not be loaded from the disk again
        video.display();
    }
}
