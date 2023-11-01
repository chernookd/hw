package edu.hw4;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task17 {

    private Task17() {

    }

    public static Boolean whoBitesMoreOften(List<Animal> animals) {
        int sumOfSpidersBite = 0;
        int sumOfDogsBite = 0;
        long dogs;
        long spiders;

        Map<Boolean, List<Animal>> animalMap = animals.stream()
            .collect(Collectors.groupingBy(Animal::bites));

        if (animalMap.containsKey(true)) {
            List<Animal> bitingAnimals = animalMap.get(true);
            sumOfSpidersBite = bitingAnimals.stream()
                .filter(animal -> animal.type().equals(Animal.Type.SPIDER))
                .mapToInt(animal -> 1)
                .sum();

            sumOfDogsBite = bitingAnimals.stream()
                .filter(animal -> animal.type().equals(Animal.Type.DOG))
                .mapToInt(animal -> 1)
                .sum();
        }
        dogs = animals.stream()
            .filter(animal -> animal.type() == Animal.Type.DOG)
            .count();
        spiders = animals.stream()
            .filter(animal -> animal.type() == Animal.Type.SPIDER)
            .count();
        if (dogs == 0 || spiders == 0) {
            return false;
        }
        return (double) sumOfSpidersBite / (double) spiders > (double) sumOfDogsBite / (double) dogs;
    }
}
