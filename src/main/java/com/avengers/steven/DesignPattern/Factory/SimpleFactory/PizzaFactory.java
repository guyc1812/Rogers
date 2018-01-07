package com.avengers.steven.DesignPattern.Factory.SimpleFactory;

import com.avengers.steven.DesignPattern.Factory.SimpleFactory.AbstractPizza.Pizza;
import com.avengers.steven.DesignPattern.Factory.SimpleFactory.Pizza.CheesePizza;
import com.avengers.steven.DesignPattern.Factory.SimpleFactory.Pizza.ClamPizza;
import com.avengers.steven.DesignPattern.Factory.SimpleFactory.Pizza.PepperoniPizza;
import com.avengers.steven.DesignPattern.Factory.SimpleFactory.Pizza.VeggiePizza;

public class PizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
