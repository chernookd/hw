package edu.hw3;

import java.util.Arrays;
import java.util.Comparator;

public class DESCComp implements Comparator<String> {

    @Override
    @SuppressWarnings("ReturnCount")
    public int compare(String string1, String string2) {
        String[] stringArray1 = string1.split(" ");
        String[] stringArray2 = string2.split(" ");
        if (Arrays.equals(stringArray1, new String[0]) && !Arrays.equals(stringArray2, new String[0])) {
            return 1;
        }
        if (Arrays.equals(stringArray2, new String[0]) && !Arrays.equals(stringArray1, new String[0])) {
            return -1;
        }
        if (Arrays.equals(stringArray2, new String[0]) && Arrays.equals(stringArray1, new String[0])) {
            return 0;
        }
        String surname1;
        String surname2;
        if (stringArray1.length >= 1 && stringArray2.length >= 1) {
            surname1 = stringArray1[1];
            surname2 = stringArray2[1];
            return surname2.compareTo(surname1);
        } else {
            return stringArray2[0].compareTo(stringArray1[0]);
        }

    }
}
