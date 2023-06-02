package org.example;

public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }



    public TV getTv() {
        return tv;
    }
}
