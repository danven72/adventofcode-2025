package it.bitrock.adventofcode.day1.safe;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SafePart1Test {
    @Test
    void testStartingPoint() {
        SafePart1 safePart1 = new SafePart1();
        Integer position = safePart1.getPosition();
        assertEquals(50, position);
        assertEquals(0, safePart1.getZeroClicks());
    }

    @Test
    void doRotateNegative() {
        SafePart1 safePart1 = new SafePart1();
        safePart1.doRotate("L68");
        assertEquals(82, safePart1.getPosition());
        assertEquals(0, safePart1.getZeroClicks());
    }

    @Test
    void doRotatePositive() {
        SafePart1 safePart1 = new SafePart1();
        safePart1.doRotate("R21");
        assertEquals(71, safePart1.getPosition());
        assertEquals(0, safePart1.getZeroClicks());
    }

    @Test
    void doRotateWithZero() {
        SafePart1 safePart1 = new SafePart1();
        safePart1.doRotate("L50");
        assertEquals(0, safePart1.getPosition());
        assertEquals(1, safePart1.getZeroClicks());
    }

    @Test
    void doRotateWithHundred() {
        SafePart1 safePart1 = new SafePart1();
        safePart1.doRotate("R250");
        assertEquals(0, safePart1.getPosition());
        assertEquals(1, safePart1.getZeroClicks());
    }

    @Test
    void limitRotations() {
        SafePart1 safePart1 = new SafePart1();
        safePart1.doRotate("R150");
        assertEquals(0, safePart1.getPosition());
        assertEquals(1, safePart1.getZeroClicks());

        safePart1.doRotate("L400");
        assertEquals(0, safePart1.getPosition());
        assertEquals(2, safePart1.getZeroClicks());
    }

    @Test
    void rotate() {
        List<String> commands = List.of("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82");
        SafePart1 safePart1 = new SafePart1();
        safePart1.rotate(commands);
        assertEquals(32, safePart1.getPosition());
        assertEquals(3, safePart1.getZeroClicks());
    }

}
