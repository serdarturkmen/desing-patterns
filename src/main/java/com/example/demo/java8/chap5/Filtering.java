package com.example.demo.java8.chap5;

import com.example.demo.java8.chap4.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static void main(String... args) {

        List<Dish> vegeterianMenu =
                Dish.menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(Collectors.toList());
        vegeterianMenu.forEach(System.out::println);

        //Filtering unique numbers
        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter(x -> x %2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Limit elements 3 : ");
        List<Dish> dishLimit3 =
                Dish.menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());
        dishLimit3.forEach(System.out::println);

        System.out.println("Skipping elements : ");

        List<Dish> dishSkip2 =
                Dish.menu.stream()
                        .filter(dish -> dish.getCalories() > 300)
                        .skip(2)
                        .collect(Collectors.toList());
        dishSkip2.forEach(System.out::println);


    }

}
