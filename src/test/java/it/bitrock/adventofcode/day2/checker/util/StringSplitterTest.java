package it.bitrock.adventofcode.day2.checker.util;

import it.bitrock.adventofcode.day2.checker.IdCheckerPartOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplitterTest {
    @Test
    void testSplitInMiddle() {
        String[] parts = StringSplitter.splitInMiddle("1234");
        assertEquals(2, parts.length);
        assertEquals("12", parts[0]);
        assertEquals("34", parts[1]);

        parts = StringSplitter.splitInMiddle("12345");
        assertEquals(2, parts.length);
        assertEquals("123", parts[0]);
        assertEquals("45", parts[1]);
    }

}
