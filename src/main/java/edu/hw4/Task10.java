package edu.hw4;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {


    private Task10() {

    }

    public static List<Animal> getCountOfAnimalsWhoseAgeNotEqualsPaws(List<Animal> animals) {
        return animals.stream()
            .filter((animal -> animal.paws() != animal.age()))
            .collect(Collectors.toList());
    }
}
