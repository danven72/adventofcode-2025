package it.bitrock.adventofcode._2025.day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class Day1Ex2Test {
/*
    @Test
    void testStartingPoint() {
        Day1Ex2 day1 = new Day1Ex2();
        Integer position = day1.getPosition();
        assertEquals(50, position);
        assertEquals(0, day1.getZeroNumbers());
    }

    @Test
    void doRotateNegative() {
        Day1Ex2 day1 = new Day1Ex2();
        day1.doRotate("L68");
        assertEquals(82, day1.getPosition());
        assertEquals(1, day1.getZeroNumbers());
    }

    @Test
    void doRotatePositive() {
        Day1Ex2 day1 = new Day1Ex2();
        day1.doRotate("R21");
        assertEquals(71, day1.getPosition());
        assertEquals(0, day1.getZeroNumbers());
    }


    @Test
    void doRotateWithZero() {
        Day1Ex2 day1 = new Day1Ex2();
        day1.doRotate("L50");
        assertEquals(0, day1.getPosition());
        assertEquals(1, day1.getZeroNumbers());
    }

    @Test
    void rotatePassingFromZero() {
        List<String> commands = List.of("L51", "R2", "L4", "R5", "L2");
        Day1Ex2 day1 = new Day1Ex2();
        day1.rotate(commands);
        assertEquals(0, day1.getPosition());
        assertEquals(5, day1.getZeroNumbers());
    }


//    @Test
//    void doRotateWithHundred() {
//        Day1Ex2 day1 = new Day1Ex2();
//        day1.doRotate("R250");
//        //assertEquals(0, day1.getPosition());
//        //assertEquals(1, day1.getZeroNumbers());
//    }

    @Test
    void normalizeAmount() {
        Day1Ex2 day1 = new Day1Ex2();
        Integer amountNormalized = day1.normalizeAmount(250);
        assertEquals(50, amountNormalized);
        assertEquals(2, day1.getZeroNumbers());

        /*
        amountNormalized = day1.normalizeAmount(100);
        assertEquals(0, amountNormalized);
        assertEquals(2, day1.getZeroNumbers());

        amountNormalized = day1.normalizeAmount(705);
        assertEquals(5, amountNormalized);
        assertEquals(7, day1.getZeroNumbers());



    }
*/


}
