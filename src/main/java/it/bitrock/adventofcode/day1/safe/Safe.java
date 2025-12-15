package it.bitrock.adventofcode.day1.safe;

import java.util.List;

public interface Safe {
    void rotate(List<String> commands);
    Integer getPosition();
    Integer getZeroClicks();
}
