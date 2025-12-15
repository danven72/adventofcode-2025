package it.bitrock.adventofcode._2025.day1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1Ex1 {
    private final static String INPUT_DAY1_FILE_PATH = "src/main/resources/input/day1-ex1.txt";

    private Integer position = 50;
    private Integer zeroNumbers = 0;

    public Day1Ex1()  {
    }

    public List<String> loadInput() throws Exception {
        Path pathDay1 = Paths.get(INPUT_DAY1_FILE_PATH);
        return Files.lines(pathDay1).toList();
    }

    static void main() throws Exception {
        Day1Ex1 day1 = new Day1Ex1();
        List<String> commands = day1.loadInput();
        day1.rotate(commands);
        System.out.println("Final position: " + day1.getPosition());
        System.out.println("Number of times at zero: " + day1.getZeroNumbers());
    }

    public void rotate(List<String> commands) {
        for (String command : commands) {
            doRotate(command);
        }
    }

    public void doRotate(String command) {
        Integer amountRotation = normalizeAmount(Integer.parseInt(command.substring(1)));
        if ("L".equals(command.substring(0, 1))) {
            position = (position - amountRotation);
        }
        else if ("R".equals(command.substring(0, 1))) {
            position = (position + amountRotation);
        }
        else throw new IllegalArgumentException("Invalid command");
        if (position < 0) {
            position += 100;
        }
        if (position > 100) {
            position -= 100;
        }
        if (position == 100 || position == 0) {
            position = 0;
            zeroNumbers += 1;
        }
        System.out.println("New position: " + position);

    }

    public Integer getPosition() {
        return position;
    }

    public Integer getZeroNumbers() {
        return zeroNumbers;
    }

    public Integer normalizeAmount(Integer amount) {
        while (amount >= 100) {
            amount -= 100;
        }
        return amount;
    }
}
