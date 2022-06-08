package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        String[] answers = {"Create test"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Create test");
        Assert.assertEquals(created.getName(), expected.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Create test for edit");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Edited test"};
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        Assert.assertEquals(edited.getName(), "Edited test");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Create test for delete");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        Assert.assertNull(deleted);
    }
}