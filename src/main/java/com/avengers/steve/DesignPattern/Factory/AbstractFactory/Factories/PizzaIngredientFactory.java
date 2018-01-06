package com.avengers.steve.DesignPattern.Factory.AbstractFactory.Factories;

import com.avengers.core.demo.DesignPattern.Factory.AbstractFactory.IngredientInterface.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
