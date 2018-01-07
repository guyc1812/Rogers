package com.avengers.steven.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.steven.DesignPattern.Decorator.Decorator.coffeeType.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
