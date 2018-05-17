package com.example.demo;

import com.example.demo.observer.FirstSubs;
import com.example.demo.observer.Publisher;
import com.example.demo.observer.SecondSubs;

public class DemoApplication {


    public static void main(String[] args) {

        Publisher publisher = new Publisher();


        publisher.addSubscriber(new FirstSubs());
        publisher.addSubscriber(new SecondSubs());

        publisher.notifyALl();



    }

}
