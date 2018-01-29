package com.avengers.Rogers.DesignPattern.Factory.SimpleFactory;

import com.avengers.Rogers.DesignPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class TestDrive {

    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();

        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
