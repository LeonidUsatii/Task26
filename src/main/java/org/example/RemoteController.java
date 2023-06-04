package org.example;

import java.util.Random;

public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {

        this.tv = tv;
    }

    public void setOn(Boolean on) {
        tv.setIsOn(on);
        }
    public void addChannel() {
        tv.addChannel();
    }
    public void on(int channelNumber) {
        tv.on(channelNumber);
    }
}
