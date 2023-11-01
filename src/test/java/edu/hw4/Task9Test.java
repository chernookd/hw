package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static edu.hw4.Animal.Type.BIRD;
import static edu.hw4.Animal.Type.CAT;
import static edu.hw4.Animal.Type.DOG;
import static edu.hw4.Animal.Type.SPIDER;
import static org.assertj.core.api.Assertions.assertThat;

public class Task9Test {


    @Test
    public void getSumOfPawsTest()
    {
        Animal first = new Animal("1", CAT, Animal.Sex.F, 10, 25, 11, false);
        Animal second = new Animal("name", BIRD, Animal.Sex.F, 9, 10, 4, false);
        Animal third = new Animal("6", SPIDER, Animal.Sex.F, 8, 3, 2, false);
        Animal fourth = new Animal("name1", SPIDER, Animal.Sex.F, 7, 2, 1, false);
        Animal fifth = new Animal("5", DOG, Animal.Sex.M, 6, 50, 25, true);

        List<Animal> testList =
            new ArrayList<>(List.of(first, second, third, fourth, fifth));

        assertThat(Task9.getSumOfPaws(testList)).isEqualTo(26);
    }

}
