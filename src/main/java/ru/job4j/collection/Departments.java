package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {
        Set<String> result = new LinkedHashSet<>();
        for (String department : departments) {
            String assembly = "";
            for (String element : department.split("/")) {
                assembly += (assembly.isEmpty() ? "" : "/") + element;
                result.add(assembly);
            }
        }
        return new ArrayList<>(result);
    }

    public static void sortAsc(List<String> list) {
        list.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> list) {
        list.sort(new DepDescComp());
    }
}
