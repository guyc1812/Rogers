package com.avengers.steve.DesignPattern.Factory.FactoryMethod.Chicago;

import com.avengers.core.demo.DesignPattern.Factory.FactoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese AbstractPizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
