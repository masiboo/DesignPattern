package org.example.builder;

public class TestBuilderApp {

    public static void main(String[] args) {
        MenuItem smallCoffee = MakeMenuItem.getSmallCoffee();
        System.out.println("Name: "+smallCoffee.getName());
        System.out.println("Price: "+smallCoffee.getPrice());
        System.out.println("Size: "+smallCoffee.getSize());
    }
}
