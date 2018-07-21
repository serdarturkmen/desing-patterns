package com.example.demo.java8.wintebe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static com.example.demo.java8.wintebe.ConcurrentUtils.stop;

public class Syncronized {

    int count = 0;

    void dene() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(this::incrementSync));
        stop(executor);
        System.out.println(count);
    }

    void increment() {
        count = count + 1;
    }

    synchronized void incrementSync() {
        count = count + 1;
    }


}
