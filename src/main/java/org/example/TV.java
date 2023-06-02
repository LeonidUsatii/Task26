package org.example;

public class TV {
    private final String name;
    Channel[] channels;
    RemoteController controller;
    Boolean isOn;

    int count;

    public TV(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            this.name = "NO NUMBER";
        }
        this.channels = new Channel[65];
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public RemoteController getController() {
        return controller;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
        if (isOn) {
            System.out.println("Я телевизор " + this.name + " включён ");
        } else {
            System.out.println("Я телевизор " + this.name + " выключен ");
        }
    }

    public void addChannel() {
        if (count < channels.length) {
            this.channels[count] = new Channel();
            this.count ++;
        } else {
            System.err.println("Все каналы заняты");
        }
    }



}
