package com.avengers.Rogers.designPattern.Factory.AbstractFactory.Pizza;

import com.avengers.Rogers.designPattern.Factory.AbstractFactory.Factories.PizzaIngredientFactory;

public class VeggiePizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
