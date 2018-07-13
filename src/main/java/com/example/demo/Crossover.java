package com.example.demo;

import com.example.demo.template.IterClass;

import java.util.ArrayList;
import java.util.Collection;

public class Crossover {

    public static void main(String... args) {

        final Collection<? extends Number> foo = new ArrayList<Number>();

        foo.add(null);

        int i=1;
        if(i++ == --i){
            System.out.println(i);
        }
        else{
            System.out.println("one");
        }

        IterClass c1 = new IterClass();
        c1.run();

        System.out.println(c1.getX());

        IterClass c2 = new IterClass();
        c2.run();
        System.out.println(c2.getX());

        IterClass c3 = new IterClass();
        c3.run();
        System.out.println(c3.getX());

        c3.getX();




    }

}
