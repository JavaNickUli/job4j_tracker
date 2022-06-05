package ru.job4j.pojo;

public class Book {
    private String name;
    private int sheets;

    public Book(String name, int sheets) {
        this.name = name;
        this.sheets = sheets;
    }

    public String getName() {
        return name;
    }
}
