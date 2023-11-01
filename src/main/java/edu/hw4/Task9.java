package edu.hw4;

import java.util.List;
import java.util.Optional;

public class Task9 {


    private Task9() {

    }

    public static Integer getSumOfPaws(List<Animal> animals) {
        Optional<Integer> integerOptional = animals.stream()
            .map(Animal::paws)
            .reduce((Integer::sum));
        return integerOptional.orElse(null);
    }
}
