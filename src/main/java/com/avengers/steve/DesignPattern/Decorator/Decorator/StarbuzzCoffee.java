package com.avengers.steve.DesignPattern.Decorator.Decorator;

import com.avengers.core.demo.DesignPattern.Decorator.Decorator.Condiment.Mocha;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.Condiment.Soy;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.Condiment.Whip;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Beverage;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.DarkRoast;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.Espresso;
import com.avengers.core.demo.DesignPattern.Decorator.Decorator.coffeType.HouseBlend;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
