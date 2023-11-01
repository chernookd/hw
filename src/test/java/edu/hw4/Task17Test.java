package edu.hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static edu.hw4.Animal.Type.DOG;
import static edu.hw4.Animal.Type.SPIDER;
import static org.assertj.core.api.Assertions.assertThat;

public class Task17Test {
    private List<Animal> testListTrue;
    private List<Animal> testListFalse;
    private List<Animal> testListEmpty;

    @BeforeEach public void before(){
        Animal dog1 = new Animal("1", DOG, Animal.Sex.F, 1, 100, 25000, true);
        Animal dog2 = new Animal("2", DOG, Animal.Sex.F, 1, 100, 25000, false);
        Animal dog3 = new Animal("3", DOG, Animal.Sex.F, 1, 100, 25000, false);
        Animal spider1 = new Animal("4", SPIDER, Animal.Sex.F, 1, 2, 5, true);
        Animal spider2 = new Animal("5", SPIDER, Animal.Sex.F, 1, 2, 5, true);
        Animal spider3 = new Animal("6", SPIDER, Animal.Sex.F, 1, 2, 5, false);


        testListTrue = new ArrayList<>(List.of(dog1, dog2, dog3, spider1, spider2, spider3));
        testListFalse = new ArrayList<>(List.of(dog1, spider3));
        testListEmpty = new ArrayList<>();

    }
    @Test
    public void Task17whoBitesMoreOftenTest()
    {
        assertThat(Task17.whoBitesMoreOften(testListTrue)).isEqualTo(true);
        assertThat(Task17.whoBitesMoreOften(testListFalse)).isEqualTo(false);
        assertThat(Task17.whoBitesMoreOften(testListEmpty)).isEqualTo(false);
    }
}
