package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {

        int result = string2.split("/")[0].compareTo(string1.split("/")[0]);
        return result == 0 ? string1.compareTo(string2) : result;
    }
}