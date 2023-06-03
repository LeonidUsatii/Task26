package org.example;

public class Program {
    private String name;

    public Program(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            this.name = "NO NUMBER";
        }
    }

    public String getName() {
        return name;
    }

}
