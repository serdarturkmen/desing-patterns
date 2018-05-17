package com.example.demo.observer;

/**
 * Created by Serdar Turkmen on 16.05.2018
 */
public class FirstSubs implements Observer {

    @Override
    public void update() {
        System.out.println("first subscriber");
    }

}
