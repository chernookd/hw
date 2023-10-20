package edu.project1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameActionsTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void inputLetterTets()
    {
        System.out.print("e");
        assertEquals("e", outputStreamCaptor.toString().trim());
    }
    @Test
    public void areInCurrentWordClosedLettersTest() {
        char[] charArray1 = {'a', '*', 'c'};
        char[] charArray2 = {'a', 'b', 'c'};

        assertTrue(GameActions.areInCurrentWordClosedLetters(charArray1));
        assertFalse(GameActions.areInCurrentWordClosedLetters(charArray2));
    }
}
