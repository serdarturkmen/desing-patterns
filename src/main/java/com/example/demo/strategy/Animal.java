package com.example.demo.strategy;

public class Animal {

    private Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyType(Flys flyingType) {
        this.flyingType = flyingType;
    }


}
