package com.avengers.steven.DesignPattern.Factory.SimpleFactory.Pizza;

import com.avengers.steven.DesignPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese AbstractPizza";
        dough = "Regular Crust";
        sauce = "Marinara AbstractPizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
