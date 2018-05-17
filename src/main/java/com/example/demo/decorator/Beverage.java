package com.example.demo.decorator;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public abstract class Beverage {

    String description = "unknowen";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
