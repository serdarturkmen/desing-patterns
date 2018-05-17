package com.example.demo;

/**
 * Created by Serdar Turkmen on 15.05.2018
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton( ) {}

    public Singleton getInstance(){
        return instance;
    }
}