package org.example;

public class Channel {
    private String[] programs;

    public Channel() {
        this.programs = setPrograms();
    }

    public String[] setPrograms() {
        String[] programs = new String[15];
        for (int i = 0; i < 15; i++) {
            programs[i] = new Program("Program " + (i + 1)).getName();
        }
        return programs;
    }

    public String[] getPrograms() {
        String[] programs = new String[this.programs.length];

        for (int i = 0; i < programs.length; i++) {
            programs[i] = this.programs[i];
        }
        return programs;
    }

}
