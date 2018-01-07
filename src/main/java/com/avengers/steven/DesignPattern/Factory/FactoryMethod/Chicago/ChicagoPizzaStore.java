package com.avengers.steven.DesignPattern.Factory.FactoryMethod.Chicago;

import com.avengers.steven.DesignPattern.Factory.FactoryMethod.Pizza;
import com.avengers.steven.DesignPattern.Factory.FactoryMethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
