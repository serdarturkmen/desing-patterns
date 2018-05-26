package com.example.demo;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class SayCoffee {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " $"+ beverage1.cost());
    }
}
