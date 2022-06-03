package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        System.out.println("result (0, 0) to (2, 0) " + a.distance(b));
    }

    public double distance(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2));
    }
}
