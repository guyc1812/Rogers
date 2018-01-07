package com.avengers.steven.DesignPattern.Decorator.Decorator.coffeeType;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}

