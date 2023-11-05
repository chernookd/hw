package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task20Test {
    @Test
    void getInfoAboutErrors(){
        edu.hw4.Task20.Animal first =
            new  edu.hw4.Task20.Animal ("1",  edu.hw4.Task20.Animal.Type.DOG,
                edu.hw4.Task20.Animal.Sex.M, Integer.MAX_VALUE,
                Integer.MAX_VALUE, Integer.MAX_VALUE, false);
        String ageError = "Dog's age  0 - 20";
        String heightError = "Dog's height 0 - 150";
        String weightError = "Dog's weight 0 - 80000";


        Map<String, String> errorsMap = edu.hw4.Task20.Animal.getErrorsMap();
        System.out.println(errorsMap.toString());



        assertThat(errorsMap.entrySet().toString().contains(ageError)).isEqualTo(true);
        assertThat(errorsMap.entrySet().toString().contains(heightError)).isEqualTo(true);
        assertThat(errorsMap.entrySet().toString().contains(weightError)).isEqualTo(true);

    }
}
