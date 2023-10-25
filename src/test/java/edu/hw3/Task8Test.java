package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task8Test {
    @Test
    public void testIterator() {

        List<String> collection = new ArrayList<>(Arrays.asList("one", "two", "three"));
        Task8<String> task8 = new Task8<>(collection);

        assertTrue(task8.hasNext());
        assertEquals("three", task8.next());

        assertTrue(task8.hasNext());
        assertEquals("two", task8.next());

        assertTrue(task8.hasNext());
        assertEquals("one", task8.next());

        assertFalse(task8.hasNext());
        assertThrows(IndexOutOfBoundsException.class, task8::next);
    }
}
