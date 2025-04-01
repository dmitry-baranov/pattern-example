package com.dmitrii.behaviour.iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    void testEvenNumbersOnly() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        EvenNumberIterator iterator = new EvenNumberIterator(numbers);

        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    void testNoEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        EvenNumberIterator iterator = new EvenNumberIterator(numbers);

        assertFalse(iterator.hasNext());
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = List.of();
        EvenNumberIterator iterator = new EvenNumberIterator(numbers);

        assertFalse(iterator.hasNext());
    }

    @Test
    void testNextThrowsException() {
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        EvenNumberIterator iterator = new EvenNumberIterator(numbers);

        assertThrows(NoSuchElementException.class, iterator::next);
    }
}