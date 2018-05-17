package com.example.demo.bridge;

/**
 * Created by Serdar Turkmen on 17.05.2018
 */
public abstract class RemoteControl {

    protected Tv tv;

    public RemoteControl(Tv tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void of();

    public void setChannel(){
        tv.tuneChannel();
    }

}
