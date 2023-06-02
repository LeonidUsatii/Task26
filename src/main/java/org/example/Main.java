package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV("Samsung GQ-Q70BAT");

        RemoteController controller = new RemoteController(tv);

        controller.getTv().setOn(true);

        controller.getTv().addChannel();
        controller.getTv().addChannel();
        controller.getTv().addChannel();
        controller.getTv().addChannel();





    }
}