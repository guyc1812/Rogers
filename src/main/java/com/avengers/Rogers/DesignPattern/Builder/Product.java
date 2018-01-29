package com.avengers.Rogers.DesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("--- Product Building ---");
        parts.forEach(part -> System.out.println(part));
        System.out.println("");
    }

}
