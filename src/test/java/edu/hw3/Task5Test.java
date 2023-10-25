package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task5Test {
    @Test
    public void sortContactsNameASC() throws Exception {
        Task5 task5 = new Task5();
        String[] contacts = {"a", "l", "c"};
        task5.sortContacts(contacts, "ASC");

        assertArrayEquals(new String[]{"a", "c", "l"}, contacts);
    }

    @Test
    public void sortContactsASC() throws Exception {
        Task5 task5 = new Task5();
        String[] contacts = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        String[] sortedContacts = task5.sortContacts(contacts, "ASC");

        assertArrayEquals(new String[]{"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke" }, sortedContacts);
    }

    @Test
    public void sortContacts() throws Exception {
        Task5 task5 = new Task5();
        String[] contacts = {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String[] sortedContacts = task5.sortContacts(contacts, "DESC");

        assertArrayEquals(new String[]{"Carl Gauss", "Leonhard Euler", "Paul Erdos" }, sortedContacts);
    }

    @Test
    public void testParseContactsInvalidSort() {
        Task5 task5 = new Task5();
        String[] contacts = {"ds"};

        assertThrows(Exception.class, () -> task5.sortContacts(contacts, "fdfd2132ewfeg"));
    }
}
