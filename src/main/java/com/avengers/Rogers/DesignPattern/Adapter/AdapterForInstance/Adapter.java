package com.avengers.Rogers.DesignPattern.Adapter.AdapterForInstance;

public class Adapter implements SourceInterface {

    private SourceClass source;

    public Adapter(SourceClass source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the second method!");
    }

}