package com.avengers.steve.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Beverage;

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
