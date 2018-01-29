package com.avengers.Rogers.DesignPattern.Factory.FactoryMethod.NewYork;

import com.avengers.Rogers.DesignPattern.Factory.FactoryMethod.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Clam AbstractPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
