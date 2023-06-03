package org.example;

import java.util.Random;

public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setOn(Boolean on) {
        if (on) {
            System.out.println("Я телевизор " + tv.getName() + " включён ");
        } else {
            System.out.println("Я телевизор " + tv.getName() + " выключен ");
        }
    }

    public void on(int channelNumber) {
        Random random = new Random();
        tv.setChannel(null);
        if (channelNumber >= 0 && channelNumber < tv.getChannels().length) {
            tv.setChannel(tv.getChannels()[channelNumber]);
        } else {
            System.out.println("Такого канала нет");
        }
        if (channelNumber < tv.getCount()) {
            String program = tv.getChannels()[channelNumber].
                    getPrograms()[random.nextInt(1, tv.getChannel().getPrograms().length)];

            System.out.println("Я телевизор " + tv.getName() + " показываю программу " +
                    program + " на канале " + channelNumber);
        } else {
            System.out.println("Такого канала нет");
        }

    }
}
