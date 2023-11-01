package edu.hw4;

import edu.hw4.Task19.Animal;
import edu.hw4.Task19.ValidationError;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task19Test {

    @Test
    public void ValidateAnimalValidAnimalTest() {
        edu.hw4.Task19.Animal dog =
                new edu.hw4.Task19.Animal
                    ("Dog", edu.hw4.Task19.Animal.Type.DOG, edu.hw4.Task19.Animal.Sex.M,
                        12, 40, 10000, false);
        edu.hw4.Task19.Animal cat =
            new edu.hw4.Task19.Animal
                ("Cat", Animal.Type.CAT, edu.hw4.Task19.Animal.Sex.M,
                    1, 16, 6000, true);
        edu.hw4.Task19.Animal fish =
            new edu.hw4.Task19.Animal
                ("Fish", Animal.Type.FISH, edu.hw4.Task19.Animal.Sex.F,
                    10, 40, 10000, true);
        edu.hw4.Task19.Animal bird  =
            new edu.hw4.Task19.Animal
                ("Bird", Animal.Type.BIRD, edu.hw4.Task19.Animal.Sex.M,
                    4, 44, 100, true);
        edu.hw4.Task19.Animal spider =
            new edu.hw4.Task19.Animal
                ("Spider", Animal.Type.SPIDER, edu.hw4.Task19.Animal.Sex.F,
                    1, 1, 100, false);
        Set<ConstraintViolation<Animal>> dogErrors = ValidationError.validateAnimal(dog);
        Set<ConstraintViolation<Animal>> fishErrors = ValidationError.validateAnimal(fish);
        Set<ConstraintViolation<Animal>> birdErrors = ValidationError.validateAnimal(bird);
        Set<ConstraintViolation<Animal>> catErrors = ValidationError.validateAnimal(cat);
        Set<ConstraintViolation<Animal>> spiderErrors = ValidationError.validateAnimal(spider);

        assertTrue(dogErrors.isEmpty());
        assertTrue(fishErrors.isEmpty());
        assertTrue(birdErrors.isEmpty());
        assertTrue(catErrors.isEmpty());
        assertTrue(spiderErrors.isEmpty());
    }

    @Test
    public void ValidateAnimalInvalidAgeTest() {
        edu.hw4.Task19.Animal dog =
            new edu.hw4.Task19.Animal
                ("Dog", edu.hw4.Task19.Animal.Type.DOG, edu.hw4.Task19.Animal.Sex.M,
                    120, 40, 10000, false);
        edu.hw4.Task19.Animal cat =
            new edu.hw4.Task19.Animal
                ("Cat", Animal.Type.CAT, edu.hw4.Task19.Animal.Sex.M,
                    -1, 16, 6000, true);
        edu.hw4.Task19.Animal fish =
            new edu.hw4.Task19.Animal
                ("Fish", Animal.Type.FISH, edu.hw4.Task19.Animal.Sex.F,
                    122, 40, 10000, true);
        edu.hw4.Task19.Animal bird  =
            new edu.hw4.Task19.Animal
                ("Bird", Animal.Type.BIRD, edu.hw4.Task19.Animal.Sex.M,
                    433, 44, 100, true);
        edu.hw4.Task19.Animal spider =
            new edu.hw4.Task19.Animal
                ("Spider", Animal.Type.SPIDER, edu.hw4.Task19.Animal.Sex.F,
                    31, 1, 100, false);
        Set<ConstraintViolation<Animal>> dogErrors = ValidationError.validateAnimal(dog);
        Set<ConstraintViolation<Animal>> fishErrors = ValidationError.validateAnimal(fish);
        Set<ConstraintViolation<Animal>> birdErrors = ValidationError.validateAnimal(bird);
        Set<ConstraintViolation<Animal>> catErrors = ValidationError.validateAnimal(cat);
        Set<ConstraintViolation<Animal>> spiderErrors = ValidationError.validateAnimal(spider);


        assertTrue(birdErrors.toString().contains("Bird's age 0 - 25")
            && dogErrors.toString().contains("Dog's age  0 - 20")
            && catErrors.toString().contains("Cat's age  0 - 20")
            && fishErrors.toString().contains("Fish's age 0 - 10")
            &&  spiderErrors.toString().contains("Spider's age 0 - 5"));
    }

    @Test
    public void ValidateAnimalInvalidHeightTest() {
        edu.hw4.Task19.Animal dog =
            new edu.hw4.Task19.Animal
                ("Dog", edu.hw4.Task19.Animal.Type.DOG, edu.hw4.Task19.Animal.Sex.M,
                    1, Integer.MAX_VALUE, 10000, false);
        edu.hw4.Task19.Animal cat =
            new edu.hw4.Task19.Animal
                ("Cat", Animal.Type.CAT, edu.hw4.Task19.Animal.Sex.M,
                    1, Integer.MAX_VALUE, 6000, true);
        edu.hw4.Task19.Animal fish =
            new edu.hw4.Task19.Animal
                ("Fish", Animal.Type.FISH, edu.hw4.Task19.Animal.Sex.F,
                    1, Integer.MAX_VALUE, 10000, true);
        edu.hw4.Task19.Animal bird  =
            new edu.hw4.Task19.Animal
                ("Bird", Animal.Type.BIRD, edu.hw4.Task19.Animal.Sex.M,
                    1, Integer.MIN_VALUE, 100, true);
        edu.hw4.Task19.Animal spider =
            new edu.hw4.Task19.Animal
                ("Spider", Animal.Type.SPIDER, edu.hw4.Task19.Animal.Sex.F,
                    1, Integer.MIN_VALUE, 100, false);
        Set<ConstraintViolation<Animal>> dogErrors = ValidationError.validateAnimal(dog);
        Set<ConstraintViolation<Animal>> fishErrors = ValidationError.validateAnimal(fish);
        Set<ConstraintViolation<Animal>> birdErrors = ValidationError.validateAnimal(bird);
        Set<ConstraintViolation<Animal>> catErrors = ValidationError.validateAnimal(cat);
        Set<ConstraintViolation<Animal>> spiderErrors = ValidationError.validateAnimal(spider);


        assertTrue(birdErrors.toString().contains("Bird's height 0 - 300")
            && dogErrors.toString().contains("Dog's height 0 - 150")
            && catErrors.toString().contains("Cat's height 0 - 60")
            && fishErrors.toString().contains("Fish's height 0 - 10000")
            &&  spiderErrors.toString().contains("Spider's height 0 - 10"));
    }

    @Test
    public void ValidateAnimalInvalidWeightTest() {
        edu.hw4.Task19.Animal dog =
            new edu.hw4.Task19.Animal
                ("Dog", edu.hw4.Task19.Animal.Type.DOG, edu.hw4.Task19.Animal.Sex.M,
                    1, 1, Integer.MAX_VALUE, false);
        edu.hw4.Task19.Animal cat =
            new edu.hw4.Task19.Animal
                ("Cat", Animal.Type.CAT, edu.hw4.Task19.Animal.Sex.M,
                    1, 1, Integer.MAX_VALUE, true);
        edu.hw4.Task19.Animal fish =
            new edu.hw4.Task19.Animal
                ("Fish", Animal.Type.FISH, edu.hw4.Task19.Animal.Sex.F,
                    1, 1, Integer.MAX_VALUE, true);
        edu.hw4.Task19.Animal bird  =
            new edu.hw4.Task19.Animal
                ("Bird", Animal.Type.BIRD, edu.hw4.Task19.Animal.Sex.M,
                    1, 1, Integer.MAX_VALUE, true);
        edu.hw4.Task19.Animal spider =
            new edu.hw4.Task19.Animal
                ("Spider", Animal.Type.SPIDER, edu.hw4.Task19.Animal.Sex.F,
                    1, 1, Integer.MAX_VALUE, false);
        Set<ConstraintViolation<Animal>> dogErrors = ValidationError.validateAnimal(dog);
        Set<ConstraintViolation<Animal>> fishErrors = ValidationError.validateAnimal(fish);
        Set<ConstraintViolation<Animal>> birdErrors = ValidationError.validateAnimal(bird);
        Set<ConstraintViolation<Animal>> catErrors = ValidationError.validateAnimal(cat);
        Set<ConstraintViolation<Animal>> spiderErrors = ValidationError.validateAnimal(spider);

        assertTrue(birdErrors.toString().contains("Bird's weight 0 - 50000")
            && dogErrors.toString().contains("Dog's weight 0 - 80000")
            && catErrors.toString().contains("Cat's weight 0 - 15000")
            && fishErrors.toString().contains("Fish's weight 0 - 1000000")
            &&  spiderErrors.toString().contains("Spider's weight 0 - 500"));
    }
}
