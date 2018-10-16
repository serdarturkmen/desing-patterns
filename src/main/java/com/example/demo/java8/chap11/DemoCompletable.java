package com.example.demo.java8.chap11;


import java.util.Random;
import java.util.concurrent.*;

import static com.example.demo.java8.chap11.Util.delay;

public class DemoCompletable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> future = service.submit(new Task());
        Future<String> orderFuture = service.submit(new OrderTask());

        CompletableFuture.supplyAsync(() -> future)
                .thenApply(ft -> orderFuture);

    }


    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            delay();
            System.out.println("task completed");
            return new Random().nextInt();
        }
    }

    static class OrderTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            int delay = 500;
            //int delay = 500 + RANDOM.nextInt(2000);
            try {
                Thread.sleep(delay);
                System.out.println("Order task completed");
                return "Order completed";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Future<String> getResultOverNetwork() {
        CompletableFuture<String> future = new CompletableFuture<>();
        new Thread(() -> {
            delay(); //simulate network call
            future.complete("{\"result\":\"success\"}");
        }).start();
        return future;
    }

}

