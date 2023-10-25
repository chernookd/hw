package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.TreeMap;

public class Task7Test {
    @Test
    void task7TrueTest () {
        Comparator<String> comparator = Task7.nullComparator();
        TreeMap<String, Object> tree = new TreeMap<>(comparator);
        tree.put(null, "test");
        boolean isContainsKey = tree.containsKey(null);
        Assertions.assertTrue(isContainsKey);
    }
    @Test
    void task7FalseTest () {

        Comparator<String> comparator = Task7.nullComparator();
        TreeMap<String, Object> tree = new TreeMap<>(comparator);
        tree.put("s", "test");
        boolean isContainsKey = tree.containsKey(null);
        Assertions.assertFalse(isContainsKey);
    }
}
