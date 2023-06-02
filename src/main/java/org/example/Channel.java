package org.example;

import java.util.Arrays;

public class Channel {
    Program[] programs;

    public Channel() {
        this.programs = setPrograms();
    }

    public Program[] setPrograms() {
        Program[] programs = new Program[15];
        for (int i = 1; i <= 14; i++) {
            programs[i] = new Program("Program " + i);
        }
        return programs;
    }

}
