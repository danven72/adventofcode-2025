package it.bitrock.adventofcode._2025.day1;

import java.util.List;

public class SafeDay1Part2 extends AbstractSafe {


    public SafeDay1Part2() {
        this.position = 50;
    }

    public void clockwiseRotation(Integer amount) {
        Integer zeroClicksAfterAmounts = (position + amount) / 100;
        position = (position + amount) % 100;
        zeroClicks += zeroClicksAfterAmounts;
        output.append("New position: ").append(position).append(", Total zero clicks: ").append(zeroClicks).append("\n");
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
        output.append("New position: ").append(position).append(", Total zero clicks: ").append(zeroClicks).append("\n");
    }


}
