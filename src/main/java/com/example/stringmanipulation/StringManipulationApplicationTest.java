package com.example.stringmanipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationApplicationTest {

    @Test
    public void testGetLength() {
        assertEquals(5, StringManipulationApplication.getLength("hello"));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringManipulationApplication.reverseString("hello"));
    }

    @Test
    public void testCountCharacter() {
        assertEquals(2, StringManipulationApplication.countCharacter("hello", 'l'));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", StringManipulationApplication.toUpperCase("hello"));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("hello", StringManipulationApplication.toLowerCase("HELLO"));
    }
}
