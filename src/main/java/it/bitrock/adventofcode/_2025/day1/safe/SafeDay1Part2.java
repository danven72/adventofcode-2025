package it.bitrock.adventofcode._2025.day1.safe;


public class SafeDay1Part2 extends AbstractSafe {

    public void clockwiseRotation(Integer amount) {
        Integer zeroClicksAfterAmounts = (position + amount) / 100;
        position = (position + amount) % 100;
        zeroClicks += zeroClicksAfterAmounts;
        appendOutput();
    }

    public void counterClockwiseRotation(Integer amount){
        Integer oldPosition = position;
        Integer rotations = amount / 100;
        Integer amountCalculated = amount % 100;
        position = position - amountCalculated;

        if (position <=0) {
            position = 100 + position;
            if (oldPosition != 0)  {
                rotations +=1;
            }
            if (position == 100) {
                position = 0;
            }

        }

        zeroClicks += rotations;
        appendOutput();
    }


}
