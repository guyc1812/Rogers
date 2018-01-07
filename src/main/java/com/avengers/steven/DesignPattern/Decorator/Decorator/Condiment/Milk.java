package com.avengers.steven.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.steven.DesignPattern.Decorator.Decorator.coffeeType.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
