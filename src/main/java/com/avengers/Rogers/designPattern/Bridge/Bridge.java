package com.avengers.Rogers.designPattern.Bridge;

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