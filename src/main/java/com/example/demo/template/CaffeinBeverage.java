package com.example.demo.template;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public abstract class CaffeinBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("boild water");
    }

    public void pourInCup(){
        System.out.println("pour in cup");
    }
}
