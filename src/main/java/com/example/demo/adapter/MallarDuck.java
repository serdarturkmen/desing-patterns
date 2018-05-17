package com.example.demo.adapter;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

}
