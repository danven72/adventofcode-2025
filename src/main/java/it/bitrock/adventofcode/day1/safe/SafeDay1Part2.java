package it.bitrock.adventofcode.day1.safe;


public class SafeDay1Part2 extends AbstractSafe {

    public void clockwiseRotation(Integer amount) {
        Integer zeroClicksAfterAmounts = (position + amount) / TOTAL_POSITIONS;
        position = (position + amount) % TOTAL_POSITIONS;
        zeroClicks += zeroClicksAfterAmounts;
        appendOutput();
    }

    public void counterClockwiseRotation(Integer amount){
        Integer oldPosition = position;
        Integer rotations = amount / TOTAL_POSITIONS;
        Integer amountCalculated = amount % TOTAL_POSITIONS;
        position = position - amountCalculated;

        if (position <=0) {
            position = TOTAL_POSITIONS + position;
            if (oldPosition != 0)  {
                rotations +=1;
            }
            if (position == TOTAL_POSITIONS) {
                position = 0;
            }

        }

        zeroClicks += rotations;
        appendOutput();
    }


}
