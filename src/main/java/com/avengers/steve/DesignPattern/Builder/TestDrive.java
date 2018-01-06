package com.avengers.steve.DesignPattern.Builder;

public class TestDrive {

    public static void main(String[] args) {

        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.build(b1);
        director.build(b2);

        Product p1 = b1.getResult();
        Product p2 = b2.getResult();

        p1.show();
        p2.show();

    }

}
