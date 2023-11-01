package edu.hw4;


import java.util.List;
import java.util.Optional;

public class Task4 {

    private Task4() {

    }

    public static Animal maxNameLength(List<Animal> animals) {
        Optional<Animal> animalWithMaxName = animals.stream()
            .max((x, y) -> x.name().length() - y.name().length());
        return animalWithMaxName.orElse(null);
    }

}
