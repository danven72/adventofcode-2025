package it.bitrock.adventofcode._2025.day1.safe;

public class SafeDay1Part1 extends AbstractSafe{

    public void clockwiseRotation(Integer amount) {
        position = (position + amount) % TOTAL_POSITIONS;
        setZeroClicks();
        appendOutput();
    }

    public void counterClockwiseRotation(Integer amount){
        position = (position - amount) % TOTAL_POSITIONS;

        if (position <0) {
            position = TOTAL_POSITIONS + position;
        }
        setZeroClicks();
        appendOutput();
    }

    private void setZeroClicks() {
        if (position == 0) {
            position = 0;
            zeroClicks += 1;
        }
    }
}
