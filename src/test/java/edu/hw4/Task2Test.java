package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {
    @Test
    public void Task2SortByWeightTest()
    {
        Animal first = new Animal("1", Animal.Type.CAT, Animal.Sex.F, 1, 25, 11, false);
        Animal second = new Animal("2", Animal.Type.BIRD, Animal.Sex.F, 2, 10, 4, false);
        Animal third = new Animal("3", Animal.Type.FISH, Animal.Sex.F, 3, 7, 5, false);
        Animal fourth = new Animal("4", Animal.Type.SPIDER, Animal.Sex.F, 4, 2, 1, false);
        Animal fifth = new Animal("5", Animal.Type.DOG, Animal.Sex.M, 5, 50, 25, true);
        Animal sixth = new Animal("6", Animal.Type.SPIDER, Animal.Sex.F, 6, 3, 2, false);
        Animal seventh = new Animal("7", Animal.Type.DOG, Animal.Sex.M, 7, 50, 26, true);

        List<Animal> testList = new ArrayList<>(List.of(first, second, third, fourth, fifth, sixth, seventh));

        assertThat(Task2.sortByHeight(testList, 2)).isEqualTo(List.of(seventh, fifth));
        assertThat(Task2.sortByHeight(testList, 5)).isEqualTo(List.of(seventh, fifth, first, third, second));
        //System.out.println(Task1.sortByHeight(testList));
    }
}
