package com.avengers.steve.DesignPattern.Factory.FactoryMethod.NewYork;

import com.avengers.core.demo.DesignPattern.Factory.FactoryMethod.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie AbstractPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
