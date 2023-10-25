package edu.hw3;

import java.util.Arrays;

public class Task5 {
    private static final String ASC = "ASC";
    private static final String DESC = "DESC";

    public String[] sortContacts(String[] contacts, String sort) throws Exception {

        if (contacts == null || Arrays.equals(contacts, new String[0])) {
            return new String[0];
        }
        if (sort.equals(ASC)) {
            Arrays.sort(contacts, new ASCComp());
        } else if (sort.equals(DESC)) {
            Arrays.sort(contacts, new DESCComp());
        } else {
            throw new Exception();
        }
        return contacts;
    }

}
