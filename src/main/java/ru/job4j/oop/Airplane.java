package ru.job4j.oop;

public class Airplane implements Vehicle {
    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(" летает по воздуху.");
    }

    @Override
    public void name() {
        System.out.print("Самолет " + name);
    }
}
