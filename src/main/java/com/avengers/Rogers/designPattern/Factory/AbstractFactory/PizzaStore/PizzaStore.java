package com.avengers.Rogers.designPattern.Factory.AbstractFactory.PizzaStore;

import com.avengers.Rogers.designPattern.Factory.AbstractFactory.Pizza.AbstractPizza;

public abstract class PizzaStore {

    protected abstract AbstractPizza createPizza(String item);

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
