package com.avengers.steven.DesignPattern.Factory.AbstractFactory.Pizza;

import com.avengers.steven.DesignPattern.Factory.AbstractFactory.Factories.PizzaIngredientFactory;

public class PepperoniPizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
