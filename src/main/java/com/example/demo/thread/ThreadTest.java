package com.example.demo.thread;

public class ThreadTest {
    public static void main(String ... args){
        SampleClass runnable = new SampleClass();
        Thread thread1 = new Thread(runnable, "Thread 1");
        thread1.start();
        Thread thread2 = new Thread(runnable, "Thread 2");
        thread2.start();
    }

    public static class SampleClass implements Runnable{

        int i = 0;

        @Override
        public void run() {

            for (int l = 0; l<5; l++){
                i++;
                System.out.println("thread for "+ Thread.currentThread().getName()+" :"+ i);
            }

        }
    }
}


