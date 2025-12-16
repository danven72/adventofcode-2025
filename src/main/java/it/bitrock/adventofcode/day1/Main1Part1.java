package it.bitrock.adventofcode.day1;

import it.bitrock.adventofcode.day1.safe.SafePart1;

public class Main1Part1 extends AbstractDay1 {

    public Main1Part1()  {
        super(new SafePart1());
    }

    static void main() throws Exception {
        Main1Part1 day1 = new Main1Part1();
        day1.printOutput();
    }
}
