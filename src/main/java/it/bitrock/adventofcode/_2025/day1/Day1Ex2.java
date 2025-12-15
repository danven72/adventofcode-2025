package it.bitrock.adventofcode._2025.day1;

import it.bitrock.adventofcode._2025.day1.safe.SafeDay1Part2;

public class Day1Ex2 extends AbstractDay1 {

    public Day1Ex2()  {
        super(new SafeDay1Part2());
    }

    static void main() throws Exception {
        Day1Ex2 day1 = new Day1Ex2();
        day1.printOutput();
    }

}
