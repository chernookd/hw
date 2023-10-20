package edu.project1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private String[] words =
        {"Minsk", "Vitebsk", "Baranovichi", "Gomel", "Mogilev", "Orsha", "Pinsk", "Grodno", "Brest", "Slutsk"};

    public String[] stringSplitting(StringBuilder str) {
        String string = new String(str);
        string = string.trim();
        String[] splittingString = string.split(" ");
        List<String> ans = new ArrayList<>();
        for (String string1: splittingString) {
            if (!string1.isEmpty() && !string1.contains(" ")) {
                ans.add(string1);
            }
        }
        return ans.toArray(new String[0]);
    }

    public void setWords() throws IOException {
        StringBuilder str = new StringBuilder();
        try (FileReader reader = new FileReader("Dictionary.txt")) {
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                str.append(scan.nextLine());
            }
            this.words = stringSplitting(str);
        } catch (FileNotFoundException e) {
            throw new IOException();
        }
    }

    public String[] getWords() {
        return words;
    }
}
