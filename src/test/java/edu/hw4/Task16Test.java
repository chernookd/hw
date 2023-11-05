package edu.hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static edu.hw4.Animal.Type.BIRD;
import static edu.hw4.Animal.Type.CAT;
import static edu.hw4.Animal.Type.DOG;
import static edu.hw4.Animal.Type.SPIDER;
import static org.assertj.core.api.Assertions.assertThat;

public class Task16Test {
    private List<Animal> testList;
    private List<Animal> sortedList;

    @BeforeEach public void before(){
        Animal first = new Animal("1", CAT, Animal.Sex.F, 1, 25, 11, false);
        Animal second = new Animal("name", BIRD, Animal.Sex.F, 2, 10, 4, false);
        Animal third = new Animal("6", SPIDER, Animal.Sex.F, 6, 3, 2, false);
        Animal fourth = new Animal("name1", SPIDER, Animal.Sex.F, 4, 2, 1, false);
        Animal fifth = new Animal("5", DOG, Animal.Sex.M, 5, 50, 25, true);
        Animal sixth = new Animal("6", SPIDER, Animal.Sex.M, 6, 3, 2, false);
        Animal seventh = new Animal("7", DOG, Animal.Sex.M, 7, 50, 26, true);

        testList = new ArrayList<>(List.of(first, second, third, fourth, fifth, sixth, seventh));
        sortedList =
            Collections.unmodifiableList(new ArrayList<>(List.of(first, fifth, seventh, second, sixth, third, fourth)));
    }
    @Test
    public void getListSortedByTypeSexNameTest()
    {
        assertThat(Task16.getListSortedByTypeSexName(testList)).isEqualTo(sortedList);
    }
}
