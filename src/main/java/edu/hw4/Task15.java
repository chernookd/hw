package edu.hw4;

import java.util.List;

public class Task15 {


    private Task15() {

    }

    public static Integer getTotalWeightAnimalsThatFromKToLYearsOld(List<Animal> animals, final int k, final int l) {
        return animals.stream()
            .filter(animal -> animal.age() >= k && animal.age() <= l)
            .mapToInt(Animal::weight)
            .sum();
    }
}
