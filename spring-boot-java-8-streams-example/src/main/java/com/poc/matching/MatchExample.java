package com.poc.matching;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public void matchStream() {
        List<CarMatch> models = Arrays.asList(new CarMatch("BMW", 2011), new CarMatch("Audi", 2018), new CarMatch("Peugeot", 2015));

        boolean all = models.stream().allMatch(model -> model.getYear() > 2010);
        System.out.println("Are all of the models newer than 2010 : " + all);

        boolean any = models.stream().anyMatch(model -> model.getYear() > 2016);
        System.out.println("Are there any models newer than 2016 : " + any);

        boolean none = models.stream().noneMatch(model -> model.getYear() < 2010);
        System.out.println("Is there a car older than 2010 : " + none);
    }
}
