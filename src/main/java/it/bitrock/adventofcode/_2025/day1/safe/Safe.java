package it.bitrock.adventofcode._2025.day1.safe;

import java.util.List;

public interface Safe {
    void rotate(List<String> commands);
    Integer getPosition();
    Integer getZeroClicks();
}
