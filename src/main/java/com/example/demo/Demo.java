package com.example.demo;

import com.example.demo.adapter.Duck;
import com.example.demo.adapter.MallarDuck;
import com.example.demo.adapter.TurkeyAdapter;
import com.example.demo.adapter.WildTurkey;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Serdar Turkmen on 12.05.2018
 */
class Demo {

    public static void main(String... args) {
        final Collection<? extends Number> foo = new ArrayList<>();
        foo.add(null);

        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();

    }

}