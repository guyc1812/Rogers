package com.avengers.Rogers.designPattern.Factory.SimpleFactory;

import com.avengers.Rogers.designPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class PizzaStore {

    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
