package com.designpatterns;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OperatingSystem os = osf.getInstance("Open");
        os.spec();
        os = osf.getInstance("Closed");
        os.spec();
    }
}
