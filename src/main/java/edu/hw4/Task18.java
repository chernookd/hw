package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Task18 {


    private Task18() {

    }

    public static Animal getHeaviestFishInManyLists(List<List<Animal>> animals) {
        Optional<Animal> optionalAnimal = animals.stream()
            .map(listAnimals -> listAnimals.stream()
                .filter(animal -> animal.type() == Animal.Type.FISH)
                .max(Comparator.comparingInt(Animal::weight)).orElse(null))
            .filter(Objects::nonNull)
            .max(Comparator.comparingInt(Animal::weight));

        return optionalAnimal.orElse(null);
    }
}
