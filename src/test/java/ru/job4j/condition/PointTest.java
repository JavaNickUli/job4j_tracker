package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To22Then2dot83() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.83;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04To20Then4dot47() {
        Point a = new Point(0, 4);
        Point b = new Point(2, 0);
        double expected = 4.47;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To20Then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To14Then4dot12() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 4);
        double expected = 4.12;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To000Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To111Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = Math.sqrt(3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}