package com.learning.design.patterns;

public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening text file: " + name);
    }

    public void save() {
        System.out.println("Saving text file: " + name);
    }
}
