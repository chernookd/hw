package edu.hw4;

import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    private Task11() {

    }

    private static final int MAX_HEIGHT = 100;

    public static List<Animal> getListAnimalsThatCanBiteAndWhoseHeightExceeds100(List<Animal> animals) {
        return animals.stream()
            .filter((animal) -> animal.bites() && animal.height() > MAX_HEIGHT)
            .collect(Collectors.toList());
    }
}
