package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int numberFromLeft = Integer.parseInt(left.split(". ")[0]);
        int numberFromRight = Integer.parseInt(right.split(". ")[0]);
        return Integer.compare(numberFromLeft, numberFromRight);
    }
}