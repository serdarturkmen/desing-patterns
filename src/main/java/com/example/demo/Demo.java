package com.example.demo;

import com.example.demo.adapter.Duck;
import com.example.demo.adapter.MallarDuck;
import com.example.demo.adapter.TurkeyAdapter;
import com.example.demo.adapter.WildTurkey;
import javafx.util.Pair;

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

        OneSignalTest oneSignalTest = new OneSignalTest();
        oneSignalTest.sendNotification();
        Pair p1 = new Pair(3,4);
        Pair<String, Integer> p2 = new Pair<>("serdar", 34);

    }

}