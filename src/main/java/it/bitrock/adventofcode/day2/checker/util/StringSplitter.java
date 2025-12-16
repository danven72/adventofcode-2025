package it.bitrock.adventofcode.day2.checker.util;

public class StringSplitter {
    public static String[] splitInMiddle(String s) {
        int mid = (s.length() + 1)/ 2;
        return new String[] {
                s.substring(0, mid),
                s.substring(mid)
        };
    }

}
