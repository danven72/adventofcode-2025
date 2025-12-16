package it.bitrock.adventofcode.day2.checker;

import it.bitrock.adventofcode.day2.checker.util.StringSplitter;

import java.util.ArrayList;
import java.util.List;

public class IdCheckerPartTwo implements IdChecker {

    public boolean isWrongId(String id) {
        boolean wrong = false;
        String[] parts = StringSplitter.splitInMiddle(id);
        String leftPart = parts[0];
        String rightPart = parts[1];
        if (leftPart.equals(rightPart) || hasRepetitions(id)) {
            wrong = true;
        }
        return wrong;

    }

    /**
     * Check if the string is composed by repetitions of a sequence
     * E.g. "ababab" -> true (sequence "ab" repeated 3 times)
     *      "abcabcabc" -> true (sequence "abc" repeated 3 times)
     *      "aaaaaa" -> true (sequence "a" repeated 6 times)
     *      "abcdab" -> false
     */
    protected boolean hasRepetitions(String s) {
        final int STRING_LENGTH = s.length();
        boolean hasRepetitions = false;
        if (STRING_LENGTH > 1) {
            List<String> sequences = extractSequenceList(s);
            StringBuilder sb = new StringBuilder();
            int seqIndex = 0;
            while(seqIndex < sequences.size() && !hasRepetitions) {
                String sequence = sequences.get(seqIndex);
                int seqLength = sequence.length();
                if (STRING_LENGTH % seqLength == 0) {
                    int repetition = STRING_LENGTH / seqLength;
                    sb.append(sequence.repeat(repetition));
                    if (s.contentEquals(sb)) {
                        hasRepetitions = true;
                    } else {
                        sb.setLength(0);
                    }
                }
                seqIndex++;
            }
        }
        return hasRepetitions;
    }

    /**
     * Extract all possible sequences from the beginning of the string
     * E.g. for "ababab" it returns ["a", "ab", "aba"]
     */
    protected List<String> extractSequenceList(String s) {
        final int STRING_LENGTH = s.length();
        List<String> sequences = new ArrayList<>();
        int seqLength = 1;
        while(seqLength <= ((STRING_LENGTH+1)/2)) {
            String sequence = s.substring(0, seqLength);
            sequences.add(sequence);
            ++seqLength;
        }
        return sequences;

    }

}
