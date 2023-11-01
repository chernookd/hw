package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Task8 {

    private Task8() {

    }

    public static Animal getMoreHeavyAnimalAmongAnimalLowerThanK(List<Animal> animals, final int k) {
        Optional<Animal> animalOptional = animals.stream()
            .filter(animal -> animal.height() < k)
            .max(Comparator.comparingInt(Animal::weight));
        return animalOptional.orElse(null);
    }
}
