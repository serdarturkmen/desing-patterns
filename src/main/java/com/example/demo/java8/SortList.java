package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Serdar Turkmen on 23.05.2018
 */
public class SortList {

    public static void main(String[] args) {

        // sort examples

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "datome", 30));
        list.add(new Student(2, "ekpe", 29));
        list.add(new Student(3, "bogdan", 22));

        System.out.println("sort by name");
        List<Student> slist = list.stream().sorted().collect(Collectors.toList());
        slist.forEach(e -> System.out.println("name : " + e.getName() + " age: " + e.getAge()));

        System.out.println("sort by name reverse");
        slist = slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("name : " + e.getName() + " age: " + e.getAge()));

        System.out.println("sort by age reverse");
        slist = slist.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("name : " + e.getName() + " age: " + e.getAge()));

        slist.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());


        //Distinct samples

        List<String> distList = Arrays.asList("AA", "BB", "CC", "BB", "EE", "AA", "AA");
        distList = distList.stream().distinct().collect(Collectors.toList());

        distList.forEach(e -> System.out.println(e));

        //match example
        List<Integer> intList = Arrays.asList(3, 4, 5, 6, 13, 15);
        System.out.println(intList);
        boolean b = intList.stream().allMatch(e -> e / 2 == 0);
        List<Integer> primeNums = intList.stream().filter(e -> e%2 != 0).collect(Collectors.toList());
        System.out.println("Prime numbers");
        primeNums.forEach(e -> System.out.println(e));

        String str = "hello world";
        Stream<String> limit = Stream.generate(str::toString).limit(5);



    }
}
