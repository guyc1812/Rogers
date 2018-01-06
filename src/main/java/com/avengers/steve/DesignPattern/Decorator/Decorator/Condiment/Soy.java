package com.avengers.steve.DesignPattern.Decorator.Decorator.Condiment;

import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
