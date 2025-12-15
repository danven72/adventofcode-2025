package it.bitrock.adventofcode.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IdRangesExplorerTest {
    @Test
    void testIdIntervals() {
        IdRangesExplorer explorer = new IdRangesExplorer();
        String[] intervals = explorer.idIntervals("100-200");
        assertEquals(2, intervals.length);
        assertEquals("100", intervals[0]);
        assertEquals("200", intervals[1]);
    }

    @Test
    void testSplitInMiddle() {
        IdRangesExplorer explorer = new IdRangesExplorer();
        String[] parts = explorer.splitInMiddle("1234");
        assertEquals(2, parts.length);
        assertEquals("12", parts[0]);
        assertEquals("34", parts[1]);

        parts = explorer.splitInMiddle("12345");
        assertEquals(2, parts.length);
        assertEquals("123", parts[0]);
        assertEquals("45", parts[1]);
    }

    @Test
    void testIsWrongId() {
        IdRangesExplorer explorer = new IdRangesExplorer();
        assertFalse(explorer.isWrongId("1122"));
        assertTrue(explorer.isWrongId("1212"));
        assertTrue(explorer.isWrongId("22"));
        assertTrue(explorer.isWrongId("1188511885"));
        assertTrue(explorer.isWrongId("38593859"));
    }

    @Test
    void testFindWrongIds() {
        IdRangesExplorer explorer = new IdRangesExplorer();
        var wrongIds = explorer.findWrongIds("11-22");
        assertEquals(2, wrongIds.size());
        assertTrue(wrongIds.contains(11));
        assertTrue(wrongIds.contains(22));

        wrongIds = explorer.findWrongIds("95-115");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(99));

        wrongIds = explorer.findWrongIds("998-1012");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(1010));

        wrongIds = explorer.findWrongIds("1188511880-1188511890");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(1188511885));

        wrongIds = explorer.findWrongIds("222220-222224");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(222222));

        wrongIds = explorer.findWrongIds("1698522-1698528");
        assertEquals(0, wrongIds.size());

        wrongIds = explorer.findWrongIds("446443-446449");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(446446));

        wrongIds = explorer.findWrongIds("38593856-38593862");
        assertEquals(1, wrongIds.size());
        assertTrue(wrongIds.contains(38593859));
    }

    @Test
    void testSumWrongIds() {
        List<String> idsIntervalList = List.of(
                "11-22",
                "95-115",
                "998-1012",
                "1188511880-1188511890",
                "222220-222224",
                "1698522-1698528",
                "446443-446449",
                "38593856-38593862"
        );
        IdRangesExplorer explorer = new IdRangesExplorer();
        Long sum = explorer.sumWrongIds(idsIntervalList);
        assertEquals(1227775554, sum);
    }
}
