package com.avengers.Rogers.designPattern.Factory.AbstractFactory.Factories;

import com.avengers.Rogers.designPattern.Factory.AbstractFactory.IngredientInterface.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
