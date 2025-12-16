package it.bitrock.adventofcode.day2.checker;

public class IdCheckerPartOne implements IdChecker {

    public boolean isWrongId(String id) {
        boolean wrong = false;
        String[] parts = splitInMiddle(id);
        String leftPart = parts[0];
        String rightPart = parts[1];
        if (leftPart.equals(rightPart)) {
            wrong = true;
        }
        return wrong;
    }

    public String[] splitInMiddle(String s) {
        int mid = (s.length() + 1)/ 2;
        return new String[] {
                s.substring(0, mid),
                s.substring(mid)
        };
    }
}
