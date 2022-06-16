package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ItemTest {

    @Test
    public void compareTo() {
        List<Item> items = Arrays.asList(
                new Item("test3"),
                new Item("test5"),
                new Item("test2"),
                new Item("test4"),
                new Item("test1")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("test1"),
                new Item("test2"),
                new Item("test3"),
                new Item("test4"),
                new Item("test5")
        );
        Assert.assertEquals(items, expected);
    }

    @Test
    public void compareToReverse() {
        List<Item> items = Arrays.asList(
                new Item("test3"),
                new Item("test5"),
                new Item("test2"),
                new Item("test4"),
                new Item("test1")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("test5"),
                new Item("test4"),
                new Item("test3"),
                new Item("test2"),
                new Item("test1")
        );
        Assert.assertEquals(items, expected);
    }
}