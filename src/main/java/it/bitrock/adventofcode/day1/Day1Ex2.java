package it.bitrock.adventofcode.day1;

import it.bitrock.adventofcode.day1.safe.SafePart2;

public class Day1Ex2 extends AbstractDay1 {

    public Day1Ex2()  {
        super(new SafePart2());
    }

    static void main() throws Exception {
        Day1Ex2 day1 = new Day1Ex2();
        day1.printOutput();
    }

}
