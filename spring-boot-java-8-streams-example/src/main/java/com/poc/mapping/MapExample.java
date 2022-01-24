package com.poc.mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public void traditionalApproach() {
        List<String> models = Arrays.asList("BMW", "Audi", "Peugeot", "Fiat");
        System.out.print("- Imperative style : " + "\n");
        for (String car : models) {
            if (!car.equals("Fiat")) {
                CarMap model = new CarMap(car);
                System.out.println(model);
            }
        }
    }

    public void streamApproach() {
        List<String> models = Arrays.asList("BMW", "Audi", "Peugeot", "Fiat");
        System.out.print("- Functional style : " + "\n");
        models.stream()
                .filter(model -> !model.equals("Fiat"))
             //   .map(CarMap::new) // Method reference approach
             //   .map(model -> new CarMap(model)) // Lambda approach
                .forEach(System.out::println);
    }
}
