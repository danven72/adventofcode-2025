package it.bitrock.adventofcode._2025.day1;

import java.util.List;

public class Safe {

    private Integer position;
    private Integer zeroClicks = 0;
    private final StringBuilder output = new StringBuilder();

    public Safe() {
        this.position = 50;
    }

    public void rotate(List<String> commands) {
        int commandNumber = 1;
        for (String command : commands) {
            output.append("Command ").append(commandNumber).append(": ");
            doRotate(command);
            ++commandNumber;
        }
    }

    public void doRotate(String command) {
        Integer amountRotation = Integer.parseInt(command.substring(1));
        if ("L".equals(command.substring(0, 1))) {
            output.append("CounterClockWise rotation - amount: ").append(amountRotation).append(" - ");
            counterClockwiseRotation(amountRotation);
        }
        else if ("R".equals(command.substring(0, 1))) {
            output.append("ClockWise rotation - amount: ").append(amountRotation).append(" - ");
            clockwiseRotation(amountRotation);
        }
        else throw new IllegalArgumentException("Invalid command");
        System.out.println(output.toString());
        output.setLength(0);
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


    public Integer getPosition() {
        return position;
    }

    public Integer getZeroClicks() {
        return zeroClicks;
    }
}
