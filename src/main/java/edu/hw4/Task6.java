package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Task6 {

    private Task6() {

    }

    public static Map<Animal.Type, Animal> getHeaviestAnimalBySpecies(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.toMap(Animal::type, t -> t,
                BinaryOperator.maxBy(Comparator.comparingInt(Animal::weight))));
    }
}
