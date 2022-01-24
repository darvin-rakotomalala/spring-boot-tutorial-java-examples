package com.poc.mapping;

public class CarMap {
    private String name;

    public CarMap(String model) {
        this.name = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + "'";
    }
}
