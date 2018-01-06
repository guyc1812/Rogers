package com.avengers.steve.DesignPattern.Factory.AbstractFactory.PizzaStore;

import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Factories.ChicagoPizzaIngredientFactory;
import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Factories.PizzaIngredientFactory;
import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected AbstractPizza createPizza(String item) {

        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese AbstractPizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie AbstractPizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam AbstractPizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni AbstractPizza");
                break;
        }
        return pizza;
    }

}
