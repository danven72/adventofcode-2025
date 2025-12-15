package it.bitrock.adventofcode.day2;

import java.util.ArrayList;
import java.util.List;

public class IdRangesExplorer {

    public Long sumWrongIds(List<String> idsIntervalList) {
        Long sum = 0l;
        for (String idsIntervalAsString: idsIntervalList) {
            List<Long> wrongIds = findWrongIds(idsIntervalAsString);
            System.out.println("Wrong IDs in interval " + idsIntervalAsString + ": " + wrongIds);
            sum += wrongIds.stream().mapToLong(Long::longValue).sum();
        }
        return sum;
    }

    public List<Long> findWrongIds(String idsIntervalAsString) {
        String[] idsInterval = idIntervals(idsIntervalAsString);
        List<Long> wrongIds = new ArrayList<>();
        for (long i = Long.parseLong(idsInterval[0]); i <= Long.parseLong(idsInterval[1]); i++) {
            String id = String.valueOf(i);
            if (isWrongId(id)) {
                wrongIds.add(i);
            }
        }
        return wrongIds;
    }

    public String[] idIntervals(String idIntervalsAsString) {
        return idIntervalsAsString.split("-");
    }

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
