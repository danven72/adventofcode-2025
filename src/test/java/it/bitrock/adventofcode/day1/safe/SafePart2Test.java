package it.bitrock.adventofcode.day1.safe;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SafePart2Test {

    @Test
    void clockwiseRotation() {
        SafePart2 safe = new SafePart2();

        safe.clockwiseRotation(170);
        assertEquals(20, safe.getPosition());
        assertEquals(2, safe.getZeroClicks());

        safe.clockwiseRotation(81);
        assertEquals(1, safe.getPosition());
        assertEquals(3, safe.getZeroClicks());

        safe.clockwiseRotation(99);
        assertEquals(0, safe.getPosition());
        assertEquals(4, safe.getZeroClicks());

        safe.clockwiseRotation(250);
        assertEquals(50, safe.getPosition());
        assertEquals(6, safe.getZeroClicks());
    }

    @Test
    void clockwiseRotationToLimits() {
        SafePart2 safe = new SafePart2();

        safe.clockwiseRotation(50);
        assertEquals(0, safe.getPosition());
        assertEquals(1, safe.getZeroClicks());

        safe.clockwiseRotation(1);
        assertEquals(1, safe.getPosition());
        assertEquals(1, safe.getZeroClicks());

        safe.clockwiseRotation(500);
        assertEquals(1, safe.getPosition());
        assertEquals(6, safe.getZeroClicks());
    }

    @Test
    void counterClockwiseRotation() {
        SafePart2 safe = new SafePart2();

        safe.counterClockwiseRotation(60);
        assertEquals(90, safe.getPosition());
        assertEquals(1, safe.getZeroClicks());

        safe.counterClockwiseRotation(90);
        assertEquals(0, safe.getPosition());
        assertEquals(2, safe.getZeroClicks());

        safe.counterClockwiseRotation(1);
        assertEquals(99, safe.getPosition());
        assertEquals(2, safe.getZeroClicks());
     }

     @Test
     void doRotate() {
        SafePart2 safe = new SafePart2();
        safe.doRotate("R1000");

        assertEquals(50, safe.getPosition());
        assertEquals(10, safe.getZeroClicks());

     }

    @Test
    void rotate() {
        List<String> commands = List.of("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82");
        SafePart2 safe = new SafePart2();
        safe.rotate(commands);
        assertEquals(32, safe.getPosition());
        assertEquals(6, safe.getZeroClicks());
    }

    @Test
    void rotateThroughLimits() {
        List<String> commands = List.of("L250", "L250" , "R250", "R250");
        SafePart2 safe = new SafePart2();
        safe.rotate(commands);
        assertEquals(50, safe.getPosition());
        assertEquals(10, safe.getZeroClicks());
    }

}
