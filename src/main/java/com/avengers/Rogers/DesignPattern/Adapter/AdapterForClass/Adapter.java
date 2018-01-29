package com.avengers.Rogers.DesignPattern.Adapter.AdapterForClass;

public class Adapter extends SourceClass implements SourceInterface {

    @Override
    public void method2() {
        System.out.println("this is the second method!");
    }

}