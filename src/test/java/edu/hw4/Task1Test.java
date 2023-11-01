package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {
    @Test
    public void Task1SortByHeightTest()
    {
        Animal first = new Animal("1", Animal.Type.CAT, Animal.Sex.F, 1, 25, 12, false);
        Animal second = new Animal("2", Animal.Type.BIRD, Animal.Sex.F, 2, 10, 12, false);
        Animal third = new Animal("3", Animal.Type.FISH, Animal.Sex.F, 3, 7, 12, false);
        Animal fourth = new Animal("4", Animal.Type.SPIDER, Animal.Sex.F, 4, 2, 1, false);
        Animal fifth = new Animal("5", Animal.Type.DOG, Animal.Sex.M, 5, 50, 25, true);
        Animal sixth = new Animal("6", Animal.Type.SPIDER, Animal.Sex.F, 6, 3, 1, false);
        Animal seventh = new Animal("7", Animal.Type.DOG, Animal.Sex.M, 7, 50, 25, true);

        List<Animal> testList = new ArrayList<>(List.of(first, second, third, fourth, fifth, sixth, seventh));

        assertThat(Task1.sortByHeight(testList)).isEqualTo(List.of(fourth, sixth, third, second, first, fifth, seventh));
        System.out.println(Task1.sortByHeight(testList));
    }
}
