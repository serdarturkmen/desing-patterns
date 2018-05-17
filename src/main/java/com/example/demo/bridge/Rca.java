package com.example.demo.bridge;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class Rca implements Tv {
    @Override
    public void on() {
        System.out.println("rca on");

    }

    @Override
    public void off() {
        System.out.println("rca off");

    }

    @Override
    public void tuneChannel() {
        System.out.println("rca tune");

    }
}
