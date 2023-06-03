package org.example;

public class TV {
    private final String name;
    private Channel channel;
    private Channel[] channels;

    private RemoteController remoteController;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public Channel[] getChannels() {
        Channel[] channels1 = new Channel[65];
        for (int i = 0; i < channels.length; i++) {
            channels1[i] = this.channels[i];
        }
        return channels1;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setIsOn(Boolean on) {
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
            this.count++;
        } else {
            System.err.println("Все каналы заняты");
        }
    }

}
