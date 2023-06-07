package org.example;

import java.util.Random;

public class TV {
    Random random = new Random();
    private final String name;
    private Channel channel;
    private Channel[] channels;
    private Boolean isOn;
    private int count;

    public TV(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            this.name = "NO NUMBER";
        }
        this.channels = new Channel[65];
        this.isOn = false;
    }

    public void setIsOn(Boolean on) {
        if (on) {
            System.out.println("Я телевизор " + this.name + " включён ");
        } else {
            System.out.println("Я телевизор " + this.name + " выключен ");
        }
    }

    public void addChannel() {
        if (count < channels.length) {
            this.channels[count] = new Channel();
            this.count++;
        } else {
            System.err.println("Все каналы заняты");
        }
    }

    public void on(int channelNumber) {
        this.channel = null;
        if (channelNumber >= 0 && channelNumber < channels.length) {
            this.channel = channels[channelNumber];
        } else {
            System.out.println("Такого канала нет");
        }
        if (channelNumber < this.count) {

            Program program = channels[channelNumber].
                    getPrograms()[random.nextInt(1, channel.getPrograms().length)];

            System.out.println("Я телевизор " + name + " показываю программу " +
                    program.getName() + " на канале " + channelNumber);
        } else {
            System.out.println("Такого канала нет");
        }

    }

}
