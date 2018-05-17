package com.example.demo;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class Single {

    public volatile static Single instance;

    private Single(){

    }

    public static synchronized Single getInstance(){
        if(instance == null){
            synchronized (Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }

}
