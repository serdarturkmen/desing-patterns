package com.example.demo.java8.chap5;

import java.util.Arrays;
import java.util.stream.Stream;

public class BuildingStreams {

    public static void main(String... args) {

        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

        Stream<String> stringStream = Stream.empty();

        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1],t[0] + t[1]})
                .limit(10)
                . map(t -> t[0])
                .forEach(System.out::println);

        // random stream of doubles with Stream.generate
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

    }
}
