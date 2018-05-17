package com.example.demo.template;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class Coffee extends CaffeinBeverage {

    @Override
    public void brew() {
        System.out.println("coffee brewing");

    }

    @Override
    public void addCondiments() {
        System.out.println("coffee condiment");

    }
}
