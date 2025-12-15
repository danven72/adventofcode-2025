package it.bitrock.adventofcode._2025.day1;

import java.util.List;

public abstract class AbstractSafe implements SafeITF {

    protected Integer position;
    protected Integer zeroClicks = 0;
    protected final StringBuilder output = new StringBuilder();

    public AbstractSafe() {
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

    public Integer getPosition() {
        return position;
    }

    public Integer getZeroClicks() {
        return zeroClicks;
    }
}
