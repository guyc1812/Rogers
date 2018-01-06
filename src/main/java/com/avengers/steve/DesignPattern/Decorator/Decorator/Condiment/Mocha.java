package com.avengers.steve.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
