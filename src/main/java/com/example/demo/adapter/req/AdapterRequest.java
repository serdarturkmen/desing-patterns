package com.example.demo.adapter.req;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class AdapterRequest implements Target {

    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
