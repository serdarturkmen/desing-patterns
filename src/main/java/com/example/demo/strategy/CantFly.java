package com.example.demo.strategy;

public class CantFly implements Flys {

    @Override
    public String fly() {
        return "I can't fly";
    }
}
