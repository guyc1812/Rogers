package com.avengers.steve.DesignPattern.Factory.AbstractFactory.PizzaStore;


import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Factories.NYPizzaIngredientFactory;
import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Factories.PizzaIngredientFactory;
import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.Pizza.*;

public class NewYorkPizzaStore extends PizzaStore {

    protected AbstractPizza createPizza(String item) {

        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese AbstractPizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie AbstractPizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam AbstractPizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni AbstractPizza");

        }
        return pizza;
    }
}
