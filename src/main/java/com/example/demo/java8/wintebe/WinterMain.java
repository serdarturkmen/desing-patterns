package com.example.demo.java8.wintebe;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class WinterMain {

    public static void main(String... args) throws InterruptedException {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.calculate(16));


        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        //First Method
        Runnable task = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        task.run();

        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done");

        //Second Method
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello" + threadName);
        });


        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }

        //Callable

        Callable<Integer> taskc = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executorc = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorc.submit(taskc);
        System.out.println("future done? " + future.isDone());
        Integer result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);

        executorc.shutdownNow();

        //Scheduling
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable taskSc = () -> System.out.println("Scheduling: " + System.nanoTime());

        int initDelay = 0;
        int period = 1;
        scheduledExecutorService.scheduleAtFixedRate(taskSc, initDelay, period, TimeUnit.SECONDS);


    }

}
