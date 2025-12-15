package it.bitrock.adventofcode.day1.safe;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SafeDay1Part1Test {
    @Test
    void testStartingPoint() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        Integer position = safeDay1Part1.getPosition();
        assertEquals(50, position);
        assertEquals(0, safeDay1Part1.getZeroClicks());
    }

    @Test
    void doRotateNegative() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.doRotate("L68");
        assertEquals(82, safeDay1Part1.getPosition());
        assertEquals(0, safeDay1Part1.getZeroClicks());
    }

    @Test
    void doRotatePositive() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.doRotate("R21");
        assertEquals(71, safeDay1Part1.getPosition());
        assertEquals(0, safeDay1Part1.getZeroClicks());
    }

    @Test
    void doRotateWithZero() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.doRotate("L50");
        assertEquals(0, safeDay1Part1.getPosition());
        assertEquals(1, safeDay1Part1.getZeroClicks());
    }

    @Test
    void doRotateWithHundred() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.doRotate("R250");
        assertEquals(0, safeDay1Part1.getPosition());
        assertEquals(1, safeDay1Part1.getZeroClicks());
    }

    @Test
    void limitRotations() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.doRotate("R150");
        assertEquals(0, safeDay1Part1.getPosition());
        assertEquals(1, safeDay1Part1.getZeroClicks());

        safeDay1Part1.doRotate("L400");
        assertEquals(0, safeDay1Part1.getPosition());
        assertEquals(2, safeDay1Part1.getZeroClicks());
    }

    /*
    @Test
    void normalizeAmount() {
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        Integer amountNormalized = safeDay1Part1.normalizeAmount(250);
        assertEquals(50, amountNormalized);

        amountNormalized = safeDay1Part1.normalizeAmount(100);
        assertEquals(0, amountNormalized);

        amountNormalized = safeDay1Part1.normalizeAmount(705);
        assertEquals(5, amountNormalized);

    }
    
     */

    @Test
    void rotate() {
        List<String> commands = List.of("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82");
        SafeDay1Part1 safeDay1Part1 = new SafeDay1Part1();
        safeDay1Part1.rotate(commands);
        assertEquals(32, safeDay1Part1.getPosition());
        assertEquals(3, safeDay1Part1.getZeroClicks());
    }

}
