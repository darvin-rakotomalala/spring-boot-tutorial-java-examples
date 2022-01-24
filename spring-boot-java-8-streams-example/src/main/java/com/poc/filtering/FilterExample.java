package com.poc.filtering;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public void Example1() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Orange");
        // Traditional approach
        System.out.println("- Traditional approach ***");
        for (String fruit : fruits) {
            if (!fruit.equals("Orange")) {
                System.out.println(fruit + " ");
            }
        }

        // Stream approach
        System.out.println("- Stream approach ***");
        fruits.stream()
                .filter(fruit -> !fruit.equals("Orange"))
                .forEach(fruit -> System.out.println(fruit));
    }

    // En utilisant Object::method;
    public void Example2() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Orange");
        fruits.stream()
                .filter(FilterExample::isNotOrange)
                .forEach(System.out::println);
    }

    private static boolean isNotOrange(String fruit) {
        return !fruit.equals("Orange");
    }
}
