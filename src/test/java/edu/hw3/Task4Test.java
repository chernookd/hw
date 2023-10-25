package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4Test {
    @Test
    public void Task4withValidNumber() throws Exception {
        int num1 = 12;
        int num2 = 122;
        int num3 = 3333;
        String res1 = "XII";
        String res2 = "CXXII";
        String res3 = "MMMCCCXXXIII";

        assertThat(Task4.convertToRoman(num1).toString()).isEqualTo(res1);
        assertThat(Task4.convertToRoman(num2).toString()).isEqualTo(res2);
        assertThat(Task4.convertToRoman(num3).toString()).isEqualTo(res3);
    }

    @Test
    public void testConvertToRoman_withInvalidNumber() {
        int number = 324234;
        assertThrows(Exception.class, () -> Task4.convertToRoman(number));
    }
}
