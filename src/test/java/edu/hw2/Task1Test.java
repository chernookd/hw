package edu.hw2;

import edu.hw2.task1.Expr.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    void constTest(){
        Constant constant = new Constant(1);
        assertThat(constant.evaluate()).isEqualTo(1);
    }
    @Test
    void negConstTest(){
        Constant constant = new Constant(1);
        Negate negate = new Negate(constant);
        assertThat(negate.evaluate()).isEqualTo(-1);
    }

    @Test
    void addTest(){
        Constant constant1 = new Constant(2);
        Constant constant2 = new Constant(3);
        Negate negate = new Negate(constant2);
        Addition addition = new Addition(constant1, negate);
        assertThat(addition.evaluate()).isEqualTo(-1);
    }
    @Test
    void multTest(){
        Constant const1 = new Constant(5);
        Constant const2 = new Constant(7);
        Multiplication multiplication = new Multiplication(const1, const2);
        assertThat(multiplication.evaluate()).isEqualTo(35);
    }
    @Test
    void expTest(){
        Constant constant = new Constant(7);
        Exponent exponent = new Exponent(constant, 2);
        assertThat(exponent.evaluate()).isEqualTo(49);
    }
}
