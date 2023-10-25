package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3Test {


    @Test
    void Task3WithStringsTest() {
        List<String> strings = Arrays.asList("a", "bb", "a", "bb", "ccc");
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 2);
        testMap.put("bb", 2);
        testMap.put("ccc", 1);
        Assertions.assertEquals(testMap, Task3.countOfSymbols(strings));
    }

    @Test
    public void Task3WithNumbersTest() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2);
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1, 2);
        testMap.put(2, 2);
        Assertions.assertEquals(testMap, Task3.countOfSymbols(numbers));
    }

    @Test
    public void Task3WithEmptyInputTest() {
        List<Integer> numbers = List.of();
        Map<Integer, Integer> testMap = new HashMap<>();
        Assertions.assertEquals(testMap, Task3.countOfSymbols(numbers));
    }
}
