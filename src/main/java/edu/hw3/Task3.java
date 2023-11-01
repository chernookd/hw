package edu.hw3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {

    private Task3() {
    }

    public static <T> Map<T, Integer> countOfSymbols(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for (T item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }
}
