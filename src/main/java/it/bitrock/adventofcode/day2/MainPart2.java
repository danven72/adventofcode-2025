package it.bitrock.adventofcode.day2;

import it.bitrock.adventofcode.day2.checker.IdCheckerPartTwo;

public class MainPart2 extends AbstractDay2 {

    public MainPart2() {
        super(new IdRangesExplorer(new IdCheckerPartTwo()));
    }

    public static void main(String[] args) throws Exception {
        MainPart2 mainPart2 = new MainPart2();
        mainPart2.printOutput();
    }
}
