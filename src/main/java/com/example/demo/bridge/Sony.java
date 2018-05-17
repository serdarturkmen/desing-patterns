package com.example.demo.bridge;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class Sony implements Tv {

    @Override
    public void on() {
        System.out.println("sony on");
    }

    @Override
    public void off() {
        System.out.println("sony on");

    }

    @Override
    public void tuneChannel() {
        System.out.println("sony on");

    }

}
