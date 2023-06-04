package org.example;

public class Channel {
    private Program[] programs;

    public Channel() {
        this.programs = setPrograms();
    }

    public Program[] setPrograms() {
        Program[] programs = new Program[15];
        for (int i = 0; i < 15; i++) {
            programs[i] = new Program("Program " + (i + 1));
        }
        return programs;
    }

    public Program[] getPrograms() {
        Program[] programs = new Program[this.programs.length];

        for (int i = 0; i < programs.length; i++) {
            programs[i] = this.programs[i];
        }
        return programs;
    }
}
