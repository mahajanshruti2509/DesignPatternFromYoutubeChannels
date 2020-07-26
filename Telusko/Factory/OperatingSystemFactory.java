package com.designpatterns;

public class OperatingSystemFactory {
    public OperatingSystem getInstance(String os) {
        if(os.equals("Open")) {
            return new Android();
        } else if (os.equals("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
