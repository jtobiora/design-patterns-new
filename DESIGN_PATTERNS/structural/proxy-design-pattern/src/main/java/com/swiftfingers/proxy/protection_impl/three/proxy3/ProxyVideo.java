package com.swiftfingers.proxy.protection_impl.three.proxy3;

public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String fileName;

    public ProxyVideo (String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
       if (realVideo == null) {
           realVideo = new RealVideo(this.fileName);
       }

       realVideo.display();
    }

}