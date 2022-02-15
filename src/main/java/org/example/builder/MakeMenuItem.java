package org.example.builder;

public class MakeMenuItem {

    private static MenuItem smallCoffee;

    public static MenuItem getSmallCoffee(){
        smallCoffee = new MenuItem.Builder()
                .name("Small coffee")
                .price(2.50f)
                .quantity(1)
                .size("large")
                .build();
        return smallCoffee;
    }

}
