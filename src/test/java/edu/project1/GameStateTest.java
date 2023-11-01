package edu.project1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameStateTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void CheckStateLoseTest() {
        GameState gameState = new GameState(GameState.getATTEMPS(), "", new char[0], "", true);
        gameState.setCurrentAttemp(GameState.getATTEMPS());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gameState.setup();
        gameState.checkState();

        assertThat(outputStream.toString().contains("YOU LOST!")).isEqualTo(true);
    }

    @Test
    void CheckStateWinTest() {
        char[] charArr = {'e', 'q', 'u', 'a', 'l'};
        GameState gameState =
            new GameState(Integer.MIN_VALUE, "equal", charArr, "equal", true);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gameState.checkState();

        assertThat(outputStream.toString().contains("WIN!")).isEqualTo(true);
    }
    @Test
    public void areInCurrentWordClosedLettersTest() {
        char[] charArray1 = {'a', '*', 'c'};
        char[] charArray2 = {'a', 'b', 'c'};

        assertTrue(GameActions.areInCurrentWordClosedLetters(charArray1));
        assertFalse(GameActions.areInCurrentWordClosedLetters(charArray2));
    }

    @Test
    public void openLetterHitTest() {
        char[] currentWord = {'*', '*', '*', '*', '*'};
        char[] currentWordAfterOpen = {'e', '*', '*', '*', '*'};
        final char newOpenLetter = 'e';
        GameState gameState =
            new GameState(Integer.MIN_VALUE, "equal", currentWord, "", true);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gameState.openLetter(newOpenLetter);

        assertThat(outputStream.toString().contains("Hit!")).isEqualTo(true);
        assertThat(outputStream.toString().contains
            ("The word " + gameState.getCurrentWordToString())).isEqualTo(true);
        assertThat(gameState.getOpenLetters().contains(String.valueOf(newOpenLetter))).isEqualTo(true);
        assertThat(gameState.getCurrentWordToString()).isEqualTo(new String(currentWordAfterOpen));
    }
    @Test
    public void openLetterMistakeTest() {
        char[] charArr = {'*', '*', '*', '*', '*'};
        GameState gameState =
            new GameState(Integer.MIN_VALUE, "equal", charArr, "", true);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        gameState.openLetter('/');

        assertThat(outputStream.toString().contains("Missed, mistake")).isEqualTo(true);
        assertThat(outputStream.toString().contains
            ("The word " + gameState.getCurrentWordToString())).isEqualTo(true);
        assertThat(gameState.getCurrentAttemp()).isEqualTo(Integer.MIN_VALUE + 1);
    }
    @Test
    public void setupTest() {
        GameState gameState = new GameState();

        gameState.setup();

        assertThat(gameState.getHiddenWord()).isNotNull();

        int sizeOfCurrentWord = gameState.getCurrentWordToString().length();
        char[] currentWord = new char[sizeOfCurrentWord];

        Arrays.fill(currentWord, '*');

        assertThat(gameState.getCurrentWord()).isEqualTo(currentWord);
    }
}
