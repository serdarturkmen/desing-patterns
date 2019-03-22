package com.example.demo;

import com.example.demo.service.SampleRetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;


@EnableRetry
@SpringBootApplication
public class DemoApplication {

    @Autowired
    private SampleRetryService sampleRetryService;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        //Publisher publisher = new Publisher();


        //publisher.addSubscriber(new FirstSubs());
        //publisher.addSubscriber(new SecondSubs());

        //publisher.notifyALl();

    }

}
