package ru.job4j.oop;

public class Train implements Vehicle {
    private String name;

    public Train(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(" передвигается по рельсам.");
    }

    @Override
    public void name() {
        System.out.print("Поезд " + name);
    }
}
