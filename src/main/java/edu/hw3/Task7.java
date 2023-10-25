package edu.hw3;

import java.util.Comparator;

public class Task7 {
    private Task7() {

    }

    public static Comparator<String> nullComparator() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
