package it.bitrock.adventofcode._2025.day1;

public interface SafeITF {
    void clockwiseRotation(Integer amount);
    void counterClockwiseRotation(Integer amount);
    Integer getPosition();
    Integer getZeroClicks();
}
