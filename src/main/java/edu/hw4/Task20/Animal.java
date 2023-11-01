package edu.hw4.Task20;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public record Animal(
    @NotNull
    String name,

    @NotNull
    Type type,

    @NotNull
    Sex sex,

    @Max(value = 25, groups = Bird.class, message = "Bird's age 0 - 25")
    @Max(value = 20, groups = Dog.class, message = "Dog's age  0 - 20")
    @Max(value = 20, groups = Cat.class, message = "Cat's age  0 - 20")
    @Max(value = 10, groups = Fish.class, message = "Fish's age 0 - 10")
    @Max(value = 5, groups = Spider.class, message = "Spider's age 0 - 5")
    @Min(value = 0, groups = Dog.class, message = "Dog's age  0 - 20")
    @Min(value = 0, groups = Cat.class, message = "Cat's age  0 - 20")
    @Min(value = 0, groups = Spider.class, message = "Spider's age 0 - 5")
    @Min(value = 0, groups = Bird.class, message = "Bird's age 0 - 25")
    @Min(value = 0, groups = Fish.class, message = "Fish's age 0 - 10")
    int age,

    @Max(value = 150, groups = Dog.class, message = "Dog's height 0 - 150")
    @Max(value = 60, groups = Cat.class, message = "Cat's height 0 - 60")
    @Max(value = 10, groups = Spider.class, message = "Spider's height 0 - 10")
    @Max(value = 10000, groups = Fish.class, message = "Fish's height 0 - 10000")
    @Max(value = 300, groups = Bird.class, message = "Bird's height 0 - 300")
    @Min(value = 0, groups = Bird.class, message = "Bird's height 0 - 300")
    @Min(value = 0, groups = Dog.class, message = "Dog's height 0 - 150")
    @Min(value = 0, groups = Cat.class, message = "Cat's height 0 - 60")
    @Min(value = 0, groups = Spider.class, message = "Spider's height 0 - 10")
    @Min(value = 0, groups = Fish.class, message = "Fish's height 0 - 10000")
    int height,

    @Max(value = 80000, groups = Dog.class, message = "Dog's weight 0 - 80000")
    @Max(value = 15000, groups = Cat.class, message = "Cat's weight 0 - 15000")
    @Max(value = 500, groups = Spider.class, message = "Spider's weight 0 - 500")
    @Max(value = 1000000, groups = Fish.class, message = "Fish's weight 0 - 1000000")
    @Max(value = 50000, groups = Bird.class, message = "Bird's weight 0 - 50000")
    @Min(value = 0, groups = Bird.class, message = "Bird's weight 0 - 50000")
    @Min(value = 0, groups = Dog.class, message = "Dog's weight 0 - 80000")
    @Min(value = 0, groups = Cat.class, message = "Cat's weight 0 - 15000")
    @Min(value = 0, groups = Spider.class, message = "Spider's weight 0 - 500")
    @Min(value = 0, groups = Fish.class, message = "Fish's weight 0 - 100000")
    int weight,

    boolean bites
) {
    private static Map<String, String> errorsMap = new HashMap<>();
    private static Map<String, Set<ConstraintViolation<Animal>>> errors = new HashMap<>();


    public static Map<String, String> getErrorsMap() {
        return errorsMap;
    }


    public Animal(
        @NotNull
        String name,

        @NotNull
        Type type,

        @NotNull
        Sex sex,

        @Max(value = 25, groups = Bird.class, message = "Bird's age 0 - 25")
        @Max(value = 20, groups = Dog.class, message = "Dog's age  0 - 20")
        @Max(value = 20, groups = Cat.class, message = "Cat's age  0 - 20")
        @Max(value = 10, groups = Fish.class, message = "Fish's age 0 - 10")
        @Max(value = 5, groups = Spider.class, message = "Spider's age 0 - 5")
        @Min(value = 0, groups = Dog.class, message = "Dog's age  0 - 20")
        @Min(value = 0, groups = Cat.class, message = "Cat's age  0 - 20")
        @Min(value = 0, groups = Spider.class, message = "Spider's age 0 - 5")
        @Min(value = 0, groups = Bird.class, message = "Bird's age 0 - 25")
        @Min(value = 0, groups = Fish.class, message = "Fish's age 0 - 10")
        int age,

        @Max(value = 150, groups = Dog.class, message = "Dog's height 0 - 150")
        @Max(value = 60, groups = Cat.class, message = "Cat's height 0 - 60")
        @Max(value = 10, groups = Spider.class, message = "Spider's height 0 - 10")
        @Max(value = 10000, groups = Fish.class, message = "Fish's height 0 - 10000")
        @Max(value = 300, groups = Bird.class, message = "Bird's height 0 - 300")
        @Min(value = 0, groups = Bird.class, message = "Bird's height 0 - 300")
        @Min(value = 0, groups = Dog.class, message = "Dog's height 0 - 150")
        @Min(value = 0, groups = Cat.class, message = "Cat's height 0 - 60")
        @Min(value = 0, groups = Spider.class, message = "Spider's height 0 - 10")
        @Min(value = 0, groups = Fish.class, message = "Fish's height 0 - 10000")
        int height,

        @Max(value = 80000, groups = Dog.class, message = "Dog's weight 0 - 80000")
        @Max(value = 15000, groups = Cat.class, message = "Cat's weight 0 - 15000")
        @Max(value = 500, groups = Spider.class, message = "Spider's weight 0 - 500")
        @Max(value = 1000000, groups = Fish.class, message = "Fish's weight 0 - 1000000")
        @Max(value = 50000, groups = Bird.class, message = "Bird's weight 0 - 50000")
        @Min(value = 0, groups = Bird.class, message = "Bird's weight 0 - 50000")
        @Min(value = 0, groups = Dog.class, message = "Dog's weight 0 - 80000")
        @Min(value = 0, groups = Cat.class, message = "Cat's weight 0 - 15000")
        @Min(value = 0, groups = Spider.class, message = "Spider's weight 0 - 500")
        @Min(value = 0, groups = Fish.class, message = "Fish's weight 0 - 100000")
        int weight,

        boolean bites
    ) {
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bites = bites;
        checkAnimal();
        }

    private void checkAnimal() {
        var validations = edu.hw4.Task20.ValidationError.validateAnimal(this);
        errors.put(this.name, validations);
        StringBuilder stringBuilder = new StringBuilder();
        for (var val : validations) {
            stringBuilder.append(val.getMessageTemplate()).append(" ");
        }
        errorsMap.put(this.name, errors.toString());
    }

    public enum Sex {
        M, F
    }

    public enum Type {
        CAT, DOG, BIRD, FISH, SPIDER
    }

    public interface Dog {
    }

    public interface Cat {
    }

    public interface Fish {
    }

    public interface Bird {
    }

    public interface Spider {
    }
}
