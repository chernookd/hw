package edu.project1;

import java.util.Scanner;

@SuppressWarnings("RegexpSinglelineJava")
public class GameActions {

    private GameActions() {
    }


    public static char inputLetter() {
        //LOGGER.info("Guess a letter");
        System.out.println("Guess a letter");
        Scanner in = new Scanner(System.in);
        return in.next().charAt(0);
    }

    public static boolean areInCurrentWordClosedLetters(char[] charArray) {
        for (char c : charArray) {
            if (c == '*') {
                return true;
            }
        }
        return false;
    }
}
