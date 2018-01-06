package com.avengers.steve.DesignPattern.Builder;

public class ConcreteBuilder2 implements Builder {

    private Product product = new Product();

    public void buildPartA() {
        product.addPart("part-A");
    }

    public void buildPartB() {
        product.addPart("part-B");
    }

    public Product getResult() {
        return product;
    }

}
