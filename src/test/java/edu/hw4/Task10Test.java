package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static edu.hw4.Animal.Type.BIRD;
import static edu.hw4.Animal.Type.CAT;
import static edu.hw4.Animal.Type.DOG;
import static edu.hw4.Animal.Type.FISH;
import static edu.hw4.Animal.Type.SPIDER;
import static org.assertj.core.api.Assertions.assertThat;

public class Task10Test {


    @Test
    public void getCountOfAnimalsWhoseAgeNotEqualsPawsTest() {
        Animal first = new Animal("1", CAT, Animal.Sex.F, 10, 25, 11, false);
        Animal second = new Animal("name", BIRD, Animal.Sex.F, 2, 10, 4, false);
        Animal third = new Animal("6", SPIDER, Animal.Sex.F, 8, 3, 2, false);
        Animal fourth = new Animal("name1", SPIDER, Animal.Sex.F, 7, 2, 1, false);
        Animal fifth = new Animal("5", DOG, Animal.Sex.M, 4, 50, 25, true);
        Animal sixth = new Animal("6", SPIDER, Animal.Sex.F, 5, 3, 3, false);
        Animal seventh = new Animal("7", DOG, Animal.Sex.M, 4, 50, 26, true);
        Animal fish1 = new Animal("fish1", FISH, Animal.Sex.M, 3, 50, 5, true);
        Animal fish2 = new Animal("fish2", FISH, Animal.Sex.M, 2, 50, 5, true);
        Animal fish3 = new Animal("fish3", FISH, Animal.Sex.M, 1, 50, 7, true);

        List<Animal> testList =
            new ArrayList<>(List.of(first, second, third, fourth, fifth, sixth, seventh, fish1, fish2, fish3));
        List<Animal> ansList =
            new ArrayList<>(List.of(first, fourth, sixth, fish1, fish2, fish3));


        assertThat(Task10.getCountOfAnimalsWhoseAgeNotEqualsPaws(testList)).isEqualTo(ansList);
    }
}

