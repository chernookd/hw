package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static edu.hw4.Animal.Type.CAT;
import static edu.hw4.Animal.Type.DOG;
import static edu.hw4.Animal.Type.FISH;
import static edu.hw4.Animal.Type.SPIDER;
import static org.assertj.core.api.Assertions.assertThat;

public class Task18Test {

    @Test
    public void Task18getHeaviestFishInManyListsTest()
    {
        Animal fish1 = new Animal("1", FISH, Animal.Sex.F, 1, 12, 250, true);
        Animal fish2 = new Animal("2", FISH, Animal.Sex.F, 1, 19, 333, true);
        Animal fish3 = new Animal("3", FISH, Animal.Sex.F, 1, 18, 251, true);
        Animal fish4 = new Animal("4", FISH, Animal.Sex.F, 1, 14, 242, true);
        Animal fish5 = new Animal("5", FISH, Animal.Sex.F, 1, 21, 412, true);
        Animal fish6 = new Animal("6", FISH, Animal.Sex.F, 1, 20, 413, true);
        Animal dog = new Animal("7", DOG, Animal.Sex.F, 1, 150, 50000, true);
        Animal spider = new Animal("8", SPIDER, Animal.Sex.F, 1, 1, 2, true);
        Animal cat = new Animal("9", CAT, Animal.Sex.F, 1, 100, 5000, true);

        List<List<Animal>> testLists = new ArrayList<>(List.of(
            new ArrayList<>(List.of(fish1, fish2, dog)),
            new ArrayList<>(List.of(fish3, fish4, spider)),
            new ArrayList<>(List.of(fish5, fish6, cat))
        )
        );

        assertThat(Task18.getHeaviestFishInManyLists(testLists)).isEqualTo(fish6);
    }
}
