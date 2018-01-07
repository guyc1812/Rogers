package com.avengers.steven.DesignPattern.Factory.AbstractFactory.Factories;

import com.avengers.steven.DesignPattern.Factory.AbstractFactory.IngredientInterface.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
