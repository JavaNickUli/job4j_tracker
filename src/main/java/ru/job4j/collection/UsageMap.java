package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanivanov@yandex.ru", "Ivan Ivanov");
        map.put("alexalekseev@yandex.ru", "Alex Alekseev");
        map.put("vladvladov@yandex.ru", "Vlad Vladov");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
