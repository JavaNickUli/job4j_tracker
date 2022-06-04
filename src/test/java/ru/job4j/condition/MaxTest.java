package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void wenMaxA1B2Then2() {
        int a = 1;
        int b = 2;
        Assert.assertEquals(2, Max.max(a, b));
    }

    @Test
    public void wenMaxA1B2C3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        Assert.assertEquals(3, Max.max(a, b, c));
    }

    @Test
    public void wenMaxA1B2C3D4Then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        Assert.assertEquals(4, Max.max(a, b, c, d));
    }
}