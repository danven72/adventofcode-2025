package it.bitrock.adventofcode.day2.checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdCheckerPartTwoTest {

    @Test
    void testCountRepetitions() {
        IdCheckerPartTwo checker = new IdCheckerPartTwo();
        //assertFalse(checker.hasRepetitions("919"));
        //assertTrue(checker.hasRepetitions("9191"));
        assertTrue(checker.hasRepetitions("1188511885"));
        assertFalse(checker.hasRepetitions("8"));
    }

    @Test
    void testExtractSequenceList() {
        IdCheckerPartTwo checker = new IdCheckerPartTwo();
        var sequences = checker.extractSequenceList("1188511885");
        assertEquals(5, sequences.size());
        assertEquals("1", sequences.get(0));
        assertEquals("11", sequences.get(1));
        assertEquals("118", sequences.get(2));
        assertEquals("1188", sequences.get(3));
        assertEquals("11885", sequences.get(4));
    }

}
