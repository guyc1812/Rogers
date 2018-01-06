package com.avengers.steve.DesignPattern.Decorator.Decorator.coffeType;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
