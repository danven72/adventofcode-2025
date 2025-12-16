package it.bitrock.adventofcode.day1;

import it.bitrock.adventofcode.day1.safe.SafePart1;

public class Day1Ex1 extends AbstractDay1 {

    public Day1Ex1()  {
        super(new SafePart1());
    }

    static void main() throws Exception {
        Day1Ex1 day1 = new Day1Ex1();
        day1.printOutput();
    }
}
