package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serdar Turkmen on 16.05.2018
 */
public class Publisher {

    List<Observer> observers = new ArrayList<>();


    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }


    public void notifyALl() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
