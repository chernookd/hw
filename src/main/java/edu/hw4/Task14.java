package edu.hw4;

import java.util.List;
import java.util.Optional;

public class Task14 {

    private Task14() {

    }

    public static Boolean isInListDogTallerThanK(List<Animal> animals, final int k) {
        Optional<Animal> optionalAnimal = (animals.stream()
            .filter(animal -> {
                return animal.type().equals(Animal.Type.DOG) && animal.height() > k;
            })
            .findAny());
        return optionalAnimal.isPresent();
    }
}
