package com.avengers.Rogers.designPattern.Bridge;

public class TestDrive {

    public static void main(String[] args) {

        Bridge bridge = new Bridge();

        /*调用第一个对象*/
        Source source1 = new SubSource1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Source source2 = new SubSource2();
        bridge.setSource(source2);
        bridge.method();
    }

}
