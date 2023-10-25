package edu.hw3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {

    private Task4() {

    }

    private static final Map<Integer, String> ROMAN_SYMBOLS_MAP = new LinkedHashMap<>();

    @SuppressWarnings("MagicNumber")
    private static void createRomanNumbersMap() {
        ROMAN_SYMBOLS_MAP.put(1000, "M");
        ROMAN_SYMBOLS_MAP.put(900, "CM");
        ROMAN_SYMBOLS_MAP.put(500, "D");
        ROMAN_SYMBOLS_MAP.put(400, "CD");
        ROMAN_SYMBOLS_MAP.put(100, "C");
        ROMAN_SYMBOLS_MAP.put(90, "XC");
        ROMAN_SYMBOLS_MAP.put(50, "L");
        ROMAN_SYMBOLS_MAP.put(40, "XL");
        ROMAN_SYMBOLS_MAP.put(10, "X");
        ROMAN_SYMBOLS_MAP.put(9, "IX");
        ROMAN_SYMBOLS_MAP.put(5, "V");
        ROMAN_SYMBOLS_MAP.put(4, "IV");
        ROMAN_SYMBOLS_MAP.put(1, "I");
    }

    @SuppressWarnings("MagicNumber")
    public static StringBuilder convertToRoman(int num) throws Exception {
        createRomanNumbersMap();
        int number = num;
        StringBuilder romanNumber = new StringBuilder();
        if (number < 1 || number > 3999) {
            throw new Exception();
        }

        for (Map.Entry<Integer, String> entry : ROMAN_SYMBOLS_MAP.entrySet()) {
            int arabicValue = entry.getKey();
            String romanSymbol = entry.getValue();
            while (number >= arabicValue) {
                romanNumber.append(romanSymbol);
                number -= arabicValue;
            }
        }
        return romanNumber;
    }
}
