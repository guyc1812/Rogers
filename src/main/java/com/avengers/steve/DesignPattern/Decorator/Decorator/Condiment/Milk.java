package com.avengers.steve.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Beverage;

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
