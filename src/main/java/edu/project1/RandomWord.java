package edu.project1;

import java.io.IOException;
import java.util.Random;

@SuppressWarnings("RegexpSinglelineJava")
public class RandomWord {

    private RandomWord() {
    }

    private static final Dictionary DICTIONARY = new Dictionary();

    public static String getRandomString() {
        try {
            DICTIONARY.setWords();
            System.out.println("Hidden cities of Russia");
            //LOGGER.info("Hidden cities of Russia");
            Random random = new Random();
            int randomIndex = random.nextInt(DICTIONARY.getWords().length);
            return DICTIONARY.getWords()[randomIndex];
        } catch (IOException e) {
            Random random = new Random();
            System.out.println("Hidden cities of Belarus");
            //LOGGER.info("Hidden cities of Belarus");
            int randomIndex = random.nextInt(DICTIONARY.getWords().length);
            return DICTIONARY.getWords()[randomIndex];
        }
    }
}
