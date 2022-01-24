package com.poc.collecting;

import com.poc.mapping.CarMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public void collectStream() {
        List<String> models = Arrays.asList("BMW", "Audi", "Peugeot", "Fiat");
        List<CarMap> carList = models.stream()
                .filter(model -> !model.equals("Fiat"))
                .map(CarMap::new)
                .collect(Collectors.toList());
        System.out.println(carList);
    }
}
