package edu.hw4;

import java.util.List;

public class Task12 {

    private Task12() {

    }

    public static Integer getCountOfAnimalWhoseWeightMoreThanHeight(List<Animal> animals) {
        return Math.toIntExact(animals.stream()
            .filter((animal) -> animal.weight() > animal.height())
            .count());
    }
}
