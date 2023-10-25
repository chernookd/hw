package edu.hw3;

import java.util.HashMap;
import java.util.Map;

public class Atbash {

    public static final int NUMBER_LETTERS_IN_LATIN_ALPHABET = 26;

    private Atbash() {
    }

    private static char[] getLatinAlphabet() {
        char[] latinAlphabet = new char[NUMBER_LETTERS_IN_LATIN_ALPHABET];
        for (int i = 0; i < latinAlphabet.length; i++) {
            char letter = (char) ('A' + i);
            latinAlphabet[i] = Character.toLowerCase(letter);
        }
        return latinAlphabet;
    }

    private static Map<Character, Character> getMapWithMirrorLetters(char[] alphabet) {
        Map<Character, Character> mirrorLetters = new HashMap<>();
        for (int i = 0, k = alphabet.length - 1; i < alphabet.length; i++, k--) {
            mirrorLetters.put(alphabet[i], alphabet[k]);
        }
        return mirrorLetters;

    }

    public static String atbash(String unmodifiedString) {
        char[] alphabet = getLatinAlphabet();
        Map<Character, Character> mirrorLettersMap = getMapWithMirrorLetters(alphabet);
        char[] modifiedString = unmodifiedString.toCharArray();
        for (int i = 0; i < modifiedString.length; i++) {
            if (mirrorLettersMap.get(Character.toLowerCase(modifiedString[i])) != null) {
                char letter = mirrorLettersMap.get(Character.toLowerCase(modifiedString[i]));
                if (Character.isUpperCase(modifiedString[i])) {
                    letter = Character.toUpperCase(mirrorLettersMap.get(Character.toLowerCase(modifiedString[i])));
                }
                modifiedString[i] = letter;
            }
        }
        return new String(modifiedString);
    }
}
