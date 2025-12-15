package it.bitrock.adventofcode._2025.day1.safe;

public class SafeDay1Part1 extends AbstractSafe{

    public void clockwiseRotation(Integer amount) {
        position = (position + amount) % 100;
        setZeroClicks();
        appendOutput();
    }

    public void counterClockwiseRotation(Integer amount){
        position = (position - amount) % 100;

        if (position <0) {
            position = 100 + position;
            if (position == 100) {
                position = 0;
            }
        }
        setZeroClicks();
        appendOutput();
    }

    private void setZeroClicks() {
        if (position == 100 || position == 0) {
            position = 0;
            zeroClicks += 1;
        }
    }
}
