package com.avengers.Rogers.designPattern.Adapter.AdapterForInstance;

public class TestDrive {

    public static void main(String[] args) {
        SourceClass source = new SourceClass();
        Adapter adapter = new Adapter(source);
        adapter.method1();
        adapter.method2();
    }

}
