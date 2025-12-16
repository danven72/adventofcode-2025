package it.bitrock.adventofcode.day1;

import it.bitrock.adventofcode.day1.safe.SafePart2;

public class MainPart2 extends AbstractDay1 {

    public MainPart2()  {
        super(new SafePart2());
    }

    static void main() throws Exception {
        MainPart2 day1 = new MainPart2();
        day1.printOutput();

        //expected output: 6638
    }

}
