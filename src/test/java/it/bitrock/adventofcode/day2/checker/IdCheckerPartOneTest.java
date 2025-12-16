package it.bitrock.adventofcode.day2.checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdCheckerPartOneTest {
    @Test
    void testSplitInMiddle() {
        IdCheckerPartOne idCheckerPartOne = new IdCheckerPartOne();
        String[] parts = idCheckerPartOne.splitInMiddle("1234");
        assertEquals(2, parts.length);
        assertEquals("12", parts[0]);
        assertEquals("34", parts[1]);

        parts = idCheckerPartOne.splitInMiddle("12345");
        assertEquals(2, parts.length);
        assertEquals("123", parts[0]);
        assertEquals("45", parts[1]);
    }

    @Test
    void testIsWrongId() {
        IdCheckerPartOne idCheckerPartOne = new IdCheckerPartOne();
        assertFalse(idCheckerPartOne.isWrongId("1122"));
        assertTrue(idCheckerPartOne.isWrongId("1212"));
        assertTrue(idCheckerPartOne.isWrongId("22"));
        assertTrue(idCheckerPartOne.isWrongId("1188511885"));
        assertTrue(idCheckerPartOne.isWrongId("38593859"));
    }

}
