package com.avengers.Rogers.designPattern.Decorator.Condiment;

import com.avengers.Rogers.designPattern.Decorator.coffeeType.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
