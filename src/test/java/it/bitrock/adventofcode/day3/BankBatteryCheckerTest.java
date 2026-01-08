package it.bitrock.adventofcode.day3;

import it.bitrock.adventofcode.day3.model.Battery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankBatteryCheckerTest {

    private final BankBatteryChecker bankBatteryChecker = new BankBatteryChecker();

    @Test
    void testGetMaxJoltageBatteryArray() {
        int result = bankBatteryChecker.getMaxJoltageBatteryArray("987654321111111");
        assertEquals(98, result);

        result = bankBatteryChecker.getMaxJoltageBatteryArray("811111111111119");
        assertEquals(89, result);
        /*
        assertEquals(new Battery(8,0), result[1]);

        result = bankBatteryChecker.getMaxJoltageBatteryArray("818181911112111");
        assertEquals(new Battery(9,6), result[0]);
        //assertEquals(new Battery(8,0), result[1]);

         */

    }

    @Test
    void testExtractJoltageFromBatteryArray() {
        Battery[] input = {
                new Battery(8, 0),
                new Battery(9, 1)
        };
        int result = bankBatteryChecker.extractJoltageFromBatteryArray(input);
        assertEquals(89, result);

    }
}
