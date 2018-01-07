package com.avengers.steven.DesignPattern.Decorator.Decorator.coffeeType;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
