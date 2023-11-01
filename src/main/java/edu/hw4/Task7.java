package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7 {

    private Task7() {

    }

    public static Animal getOldestAnimalByIndex(List<Animal> animals, int k) {
        if (k >= animals.size() || k < 0) {
            return null;
        }
        Optional<Animal> findOldest = animals.stream()
            .sorted(Comparator.comparingInt(Animal::age))
            .skip(k - 1)
            .findFirst();
        return findOldest.orElse(null);
    }
}
