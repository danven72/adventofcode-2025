package it.bitrock.adventofcode.day2.checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdCheckerPartOneTest {
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
