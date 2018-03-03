package com.avengers.Rogers.designPattern.Proxy;

public class TestDrive {

    public static void main(String[] args) {
        SourceInterface source = new Proxy();
        source.method();
    }

}
