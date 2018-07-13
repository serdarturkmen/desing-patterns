package com.example.demo.template;

public class IterClass implements Runnable{

    private int x;

    @Override
    public void run() {
        for ( int i = 0; i < 10000000; i++ )
        {
            x = x + 1;
        }
    }

    public int getX() {
        return x;
    }
}
