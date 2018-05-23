package com.example.demo.template;

import java.util.function.Supplier;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class TemplateDemo {

    public static void main(String... args){

        Tea tea = new Tea();
        Supplier<Coffee> coffee = Coffee::new;
        tea.prepareRecipe();
        coffee.get().prepareRecipe();

    }
}
