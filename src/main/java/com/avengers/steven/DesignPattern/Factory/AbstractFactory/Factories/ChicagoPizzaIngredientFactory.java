package com.avengers.steven.DesignPattern.Factory.AbstractFactory.Factories;

import com.avengers.steven.DesignPattern.Factory.AbstractFactory.Ingredient.*;
import com.avengers.steven.DesignPattern.Factory.AbstractFactory.IngredientInterface.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}