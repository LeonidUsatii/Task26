package org.example;

public class Task26 {
    public static void main(String[] args) {

        TV tv = new TV("Samsung GQ-Q70BAT");
        RemoteController controller = new RemoteController(tv);
        controller.setOn(true);
        controller.getTv().addChannel();
        controller.getTv().addChannel();
        controller.on(1);
        controller.setOn(false);
    }
}