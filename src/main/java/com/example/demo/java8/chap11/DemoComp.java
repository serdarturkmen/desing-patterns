package com.example.demo.java8.chap11;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Stream;

import static com.example.demo.java8.chap11.Util.delay;

public class DemoComp {

    public static void main(String ...args) throws ExecutionException, InterruptedException {

//        Future<String> resultsOverNetwork = getResultsOverNetwork();
        System.out.println("starting");
        CompletableFuture<Void> future =
                CompletableFuture.supplyAsync(DemoComp::getFruits)
                .thenCombine(CompletableFuture.supplyAsync(DemoComp::getVeggies),
                        (fruits, veggies) ->
                                Stream.concat(Arrays.stream(fruits), Arrays.stream(veggies))
                ).thenAccept(items -> items.forEach(System.out::println));
        future.join();

        System.out.println("finished");

    }


    public static Future<String> getResultsOverNetwork(){

        CompletableFuture<String> future = new CompletableFuture<>();
        new Thread(()->{
            delay(500);
//            System.out.println("Results over network completed");
            future.complete("{\"result\":\"success\"}");
        }).start();

        return future;
    }

    public static String[] getFruits() {
        delay(1000); //simulate network latency
        System.out.println("Fruits are here");
        return new String[]{"apple", "apricot", "banana"};
    }

    public static String[] getVeggies() {
        delay(500); //simulate network latency
        System.out.println("Veggies are here");
        return new String[]{"broccoli", "brussels sprout"};
    }

    public static void delay(int num) {
        //int delay = 500 + RANDOM.nextInt(2000);
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
