package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Task2Test {

    @Test
    void Task2GoodCaseTest(){
        String firstTestString = "()()()";
        ArrayList<String> firstTestAns = new ArrayList<>() {{
            add("()");
            add("()");
            add("()");
        }};
        String secondTestString = "((()))";
        var secondTestAns = new ArrayList<String>() {{
            add("((()))");
        }};
        String thirdTestString = "((()))(())()()(()())";
        var thirdTestAns = new ArrayList<String>() {{
            add("((()))");
            add("(())");
            add("()");
            add("()");
            add("(()())");
        }};
        String
            fourthTestString = "((())())(()(()()))";
        var fourthTestAns = new ArrayList<String>() {{
            add("((())())");
            add("(()(()()))");

        }};

        Assertions.assertEquals(Task2.clusterize(firstTestString), firstTestAns);
        Assertions.assertEquals(Task2.clusterize(secondTestString), secondTestAns);
        Assertions.assertEquals(Task2.clusterize(thirdTestString), thirdTestAns);
        Assertions.assertEquals(Task2.clusterize(fourthTestString), fourthTestAns);
    }

    @Test
    void Task2EmptyCaseTest(){
        String emptyTestString = "";
        ArrayList<String> emptyTestAns = new ArrayList<String>();
        Assertions.assertEquals(Task2.clusterize(emptyTestString), emptyTestAns);
    }

    @Test
    void Task2NullCaseTest(){
        String emptyTestString = null;
        ArrayList<String> emptyTestAns = null;
        Assertions.assertEquals(Task2.clusterize(emptyTestString), emptyTestAns);
    }

    @Test
    void Task2InvalidCaseTest(){
        String firstTestInvalidString = "(()))";
        String secondTestInvalidString = "(((())))))()";
        String thirdTestInvalidString = "f((()))";

        Assertions.assertNull(Task2.clusterize(firstTestInvalidString));
        Assertions.assertNull(Task2.clusterize(secondTestInvalidString));
        Assertions.assertNull(Task2.clusterize(thirdTestInvalidString));
    }
}
