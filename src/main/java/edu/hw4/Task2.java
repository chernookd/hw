package edu.hw4;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    private Task2() {

    }

    public static List<Animal> sortByHeight(List<Animal> animals, int k) {
        return animals.stream()
            .sorted((o1, o2) -> Integer.compare(o2.weight(), o1.weight()))
            .limit(k)
            .collect(Collectors.toList());
    }
}
