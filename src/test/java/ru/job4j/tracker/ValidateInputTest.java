package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertEquals(selected, 1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertEquals(selected, 3);
    }

    @Test
    public void whenSomeValidInput() {
        Output out = new StubOutput();
        String[] str = {"1", "0", "2"};
        Input in = new StubInput(str);
        ValidateInput input = new ValidateInput(out, in);
        String[] selected = new String[3];
        selected[0] = String.valueOf(input.askInt("Enter menu:"));
        selected[1] = String.valueOf(input.askInt("Enter menu:"));
        selected[2] = String.valueOf(input.askInt("Enter menu:"));
        Assert.assertArrayEquals(str, selected);
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        Assert.assertEquals(selected, -5);
    }
}