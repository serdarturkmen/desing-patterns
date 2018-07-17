package com.example.demo.java8.chap5;

import com.example.demo.java8.chap4.Dish;

import java.util.Optional;

public class Finding {

    public static void main(String... args) {

        if (isVegeterianFriendlyMenu()) {
            System.out.println("Vegeterian friendly");
        }

        System.out.println(isHealtyMenu());

        Optional<Dish> dish = findVegetarianDish();
        System.out.println(isHealthyMenu2());

        Optional<Dish> dishN = findVegetarianDish();
        dishN.ifPresent(d -> System.out.println(d.getName()));

    }

    private static boolean isHealtyMenu() {
        return Dish.menu.stream().anyMatch(dish -> dish.getCalories() < 10001);
    }


    public static boolean isVegeterianFriendlyMenu() {
        return Dish.menu.stream().anyMatch(Dish::isVegetarian);

    }

    private static boolean isHealthyMenu2() {
        return Dish.menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }

    private static Optional<Dish> findVegetarianDish() {
        return Dish.menu.stream().filter(Dish::isVegetarian).findAny();
    }
}
