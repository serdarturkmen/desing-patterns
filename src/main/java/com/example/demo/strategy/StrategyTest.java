package com.example.demo.strategy;

public class StrategyTest {

    public static void main(String... args){
        Animal dog = new Dog();
        dog.setFlyType(new CantFly());

        Animal bird = new Bird();
        bird.setFlyType(new ItFlys());

        System.out.println("dog : " + dog.tryToFly());
        System.out.println("bird : " + bird.tryToFly());

        dog.setFlyType(new SuperFly());
        System.out.println("dog : " + dog.tryToFly());
        

    }

}
