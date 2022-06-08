package ru.job4j.oop;

public class Bus implements Vehicle {
    private String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(" двигается по трассе.");
    }

    @Override
    public void name() {
        System.out.print("Автобус " + name);
    }
}
