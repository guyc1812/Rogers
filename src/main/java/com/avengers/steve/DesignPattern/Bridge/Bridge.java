package com.avengers.steve.DesignPattern.Bridge;

public class Bridge {
    private Source source;

    public void method() {
        source.method();
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}