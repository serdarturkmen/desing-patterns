package com.example.demo.adapter;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class WildTurkey implements Turkey {

    @Override
    public void gooble() {
        System.out.println("gooble");
    }

    @Override
    public void fly() {
        System.out.println("flying turkey ...");
    }
}
