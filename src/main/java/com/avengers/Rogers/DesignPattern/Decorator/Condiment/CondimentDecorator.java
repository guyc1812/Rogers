package com.avengers.Rogers.DesignPattern.Decorator.Condiment;

import com.avengers.Rogers.DesignPattern.Decorator.coffeeType.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
