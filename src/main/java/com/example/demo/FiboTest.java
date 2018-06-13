package com.example.demo;

public class FiboTest {

    public static void main(String[] args){

        int x = fibo(6);
        System.out.println(x);

    }

    private static int fibo(int i) {
        if(i == 0){
            return 0;
        }else if(i == 1){
            return 1;
        }
        return fibo(i-1) + fibo(i-2);
    }
}