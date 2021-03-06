package com.avengers.Rogers.designPattern.Factory.AbstractFactory;

import com.avengers.Rogers.designPattern.Factory.AbstractFactory.Pizza.AbstractPizza;
import com.avengers.Rogers.designPattern.Factory.AbstractFactory.PizzaStore.ChicagoPizzaStore;
import com.avengers.Rogers.designPattern.Factory.AbstractFactory.PizzaStore.NewYorkPizzaStore;
import com.avengers.Rogers.designPattern.Factory.AbstractFactory.PizzaStore.PizzaStore;

public class TestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
