package it.bitrock.adventofcode.day2.checker;

import it.bitrock.adventofcode.day2.checker.util.StringSplitter;

public class IdCheckerPartOne implements IdChecker {

    public boolean isWrongId(String id) {
        boolean wrong = false;
        String[] parts = StringSplitter.splitInMiddle(id);
        String leftPart = parts[0];
        String rightPart = parts[1];
        if (leftPart.equals(rightPart)) {
            wrong = true;
        }
        return wrong;
    }
}
