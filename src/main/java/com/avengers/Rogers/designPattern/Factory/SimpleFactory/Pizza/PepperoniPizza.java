package com.avengers.Rogers.designPattern.Factory.SimpleFactory.Pizza;

import com.avengers.Rogers.designPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni AbstractPizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
