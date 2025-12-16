package it.bitrock.adventofcode.day2;

import it.bitrock.adventofcode.day2.checker.IdCheckerPartOne;

public class MainPart1 extends AbstractDay2 {

    public MainPart1() {
        super(new IdRangesExplorer(new IdCheckerPartOne()));
    }

    static void main(String[] args) throws Exception {
        MainPart1 mainPart1 = new MainPart1();
        mainPart1.printOutput();
    }
}
