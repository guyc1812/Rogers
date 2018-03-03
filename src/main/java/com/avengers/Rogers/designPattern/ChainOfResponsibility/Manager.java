package com.avengers.Rogers.designPattern.ChainOfResponsibility;

public abstract class Manager {

    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    protected Manager() {
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplications(Request request);
}
