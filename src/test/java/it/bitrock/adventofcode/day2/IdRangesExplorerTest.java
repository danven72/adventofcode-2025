package it.bitrock.adventofcode.day2;

import it.bitrock.adventofcode.day2.checker.IdChecker;
import it.bitrock.adventofcode.day2.checker.IdCheckerPartOne;
import it.bitrock.adventofcode.day2.checker.IdCheckerPartTwo;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IdRangesExplorerTest {


    @Nested
    class WhenUsingIdCheckerPartOne {

        private final IdChecker idCheckerPartOne = new IdCheckerPartOne();
        private final IdRangesExplorer explorer = new IdRangesExplorer(idCheckerPartOne);

        @Test
        void testIdIntervals() {
            String[] intervals = explorer.idIntervals("100-200");
            assertEquals(2, intervals.length);
            assertEquals("100", intervals[0]);
            assertEquals("200", intervals[1]);
        }


        @Test
        void testFindWrongIds() {
            var wrongIds = explorer.findWrongIds("11-22");
            assertEquals(2, wrongIds.size());
            assertTrue(wrongIds.contains(11L));
            assertTrue(wrongIds.contains(22L));

            wrongIds = explorer.findWrongIds("95-115");
            assertEquals(1L, wrongIds.size());
            assertTrue(wrongIds.contains(99L));

            wrongIds = explorer.findWrongIds("998-1012");
            assertEquals(1, wrongIds.size());
            assertTrue(wrongIds.contains(1010L));

            wrongIds = explorer.findWrongIds("1188511880-1188511890");
            assertEquals(1, wrongIds.size());
            assertTrue(wrongIds.contains(1188511885L));

            wrongIds = explorer.findWrongIds("222220-222224");
            assertEquals(1, wrongIds.size());
            assertTrue(wrongIds.contains(222222L));

            wrongIds = explorer.findWrongIds("1698522-1698528");
            assertEquals(0, wrongIds.size());

            wrongIds = explorer.findWrongIds("446443-446449");
            assertEquals(1, wrongIds.size());
            assertTrue(wrongIds.contains(446446L));

            wrongIds = explorer.findWrongIds("38593856-38593862");
            assertEquals(1, wrongIds.size());
            assertTrue(wrongIds.contains(38593859L));


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
            Long sum = explorer.sumWrongIds(idsIntervalList);
            assertEquals(1227775554, sum);
        }
    }

    @Nested
    class WhenUsingIdCheckerPartTwo {

        private final IdChecker idCheckerPartTwo = new IdCheckerPartTwo();
        private final IdRangesExplorer explorer = new IdRangesExplorer(idCheckerPartTwo);

        @Test
        void testIdIntervals() {
            String[] intervals = explorer.idIntervals("100-200");
            assertEquals(2, intervals.length);
            assertEquals("100", intervals[0]);
            assertEquals("200", intervals[1]);
        }
    }
}
