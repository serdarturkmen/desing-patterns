package com.example.demo.template;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class TemplateDemo {

    public static void main(String... args){

        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();

    }
}
