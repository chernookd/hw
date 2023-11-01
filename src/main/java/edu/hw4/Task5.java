package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static edu.hw4.Animal.Sex;

public class Task5 {

    private Task5() {
    }

    public static Sex getSexWhichGreater(List<Animal> animals) {
        Optional<Map.Entry<Sex, Integer>> sexWhichGreater = animals.stream()
            .collect(Collectors.groupingBy(Animal::sex, Collectors.summingInt(x -> 1)))
            .entrySet().stream()
            .max(Comparator.comparingInt(Map.Entry::getValue));
        return sexWhichGreater.map(Map.Entry::getKey).orElse(null);
    }
}
