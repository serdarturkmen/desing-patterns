package com.example.demo.java8.chap4;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamBasic {

    public static void main(String ...args){
        getLowCaloricDischesNames(Dish.menu).forEach(System.out::println);
    }

    private static List<String> getLowCaloricDischesNames(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }
}
