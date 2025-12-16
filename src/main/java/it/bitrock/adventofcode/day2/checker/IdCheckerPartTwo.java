package it.bitrock.adventofcode.day2.checker;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class IdCheckerPartTwo implements IdChecker {

    public boolean isWrongId(String id) {
        boolean wrong = false;
        String[] parts = splitInMiddle(id);
        String leftPart = parts[0];
        String rightPart = parts[1];
        if (leftPart.equals(rightPart) || hasRepetitions(id)) {
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

    public boolean hasRepetitions(String s) {
        final int STRING_LENGTH = s.length();
        boolean hasRepetitions = false;
        List<String> sequences = extractSequenceList(s);
        //System.out.println("Extracted sequences: " + sequences);
        StringBuilder sb = new StringBuilder();
        for (String sequence : sequences) {
            int seqLength = sequence.length();
            int v = STRING_LENGTH % seqLength;
            if (STRING_LENGTH>1 && v == 0) {
                int repetition = STRING_LENGTH/seqLength;
                for (int i=0; i<repetition; ++i) {
                    sb.append(sequence);
                }
                //System.out.println("Checking sequence: " + sequence + " - built string: " + sb.toString());
                if (s.equals(sb.toString())) {
                    hasRepetitions = true;
                    break;
                } else {
                    sb.setLength(0);
                }
            }
        }
        return hasRepetitions;
    }


    public List<String> extractSequenceList(String s) {
        final int STRING_LENGTH = s.length();
        List<String> sequences = new ArrayList<>();
        int seqLength = 1;
        while(seqLength <= ((STRING_LENGTH+1)/2)) {
            //System.out.print("Checking sequenceLenght: " + seqLength);
            String sequence = s.substring(0, seqLength);//extractSequenceOfLength(s, seqLength);
            //System.out.println(" - sequence: " + sequence);
            sequences.add(sequence);
            ++seqLength;
        }
        return sequences;

    }

}
