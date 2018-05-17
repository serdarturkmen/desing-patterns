package com.example.demo.template;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class Tea extends CaffeinBeverage {


    @Override
    public void brew() {
        System.out.println("tea brewing");
    }

    @Override
    public void addCondiments() {
        System.out.println("add first condiment");

    }
}
