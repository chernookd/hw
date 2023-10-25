package edu.hw3;

import java.util.ArrayList;

public class Task2 {

    private Task2() {

    }

    private static final char OPEN_PARENTHESIS = '(';
    private static final char CLOSE_PARENTHESIS = ')';

    private static int countCharacters(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<String> clusterize(String str) {

        if (str == null) {
            return null;
        }
        ArrayList<String> answer = new ArrayList<>();
        int countOpenParenthesis = countCharacters(str, OPEN_PARENTHESIS);
        int countCloseParenthesis = countCharacters(str, CLOSE_PARENTHESIS);
        if (countCloseParenthesis != countOpenParenthesis
            || str.length() != countCloseParenthesis + countCloseParenthesis) {
            return null;
        }
        int count = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }
            if (count == 0) {
                answer.add(str.substring(start, i + 1));
                start = i + 1;
            }
        }
        return answer;

    }
}
