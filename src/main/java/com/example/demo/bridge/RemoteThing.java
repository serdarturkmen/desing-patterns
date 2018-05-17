package com.example.demo.bridge;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public class RemoteThing extends RemoteControl {

    public RemoteThing(Tv tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void of() {
        tv.off();
    }

    @Override
    public void setChannel() {
        setChannel();
    }

}
