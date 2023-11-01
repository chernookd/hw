package edu.hw2;

import edu.hw2.task4.CallingInfo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    void callingInfoFromTestFunctionTest() {
        CallingInfo info = CallingInfo.callingInfo();

        assert info != null;
        assertEquals("edu.hw2.Task4Test", info.className());
        assertEquals("callingInfoFromTestFunctionTest", info.methodName());
    }

    @Test
    void callingInfoFromFunction1Test() {
        CallingFunctionForTask4Test.function1();
        assertThat(CallingFunctionForTask4Test.function1().methodName())
            .isEqualTo("function2");
        assertThat(CallingFunctionForTask4Test.function1().className())
            .isEqualTo("edu.hw2.CallingFunctionForTask4Test");
    }

    @Test
    void callingInfoFromFunction2Test() {
        CallingFunctionForTask4Test.function1();
        assertThat(CallingFunctionForTask4Test.function2().methodName())
            .isEqualTo("function2");
        assertThat(CallingFunctionForTask4Test.function1().className())
            .isEqualTo("edu.hw2.CallingFunctionForTask4Test");
    }
}
