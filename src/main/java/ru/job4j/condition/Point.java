package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

    public double distance(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2));
    }

    public double distance3d(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2) + pow(point.z - this.z, 2));
    }

}
