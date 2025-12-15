package it.bitrock.adventofcode._2025.day1;

import it.bitrock.adventofcode._2025.day1.safe.Safe;
import it.bitrock.adventofcode._2025.day1.safe.SafeDay1Part1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public abstract class AbstractDay1 {
    private static final String INPUT_DAY1_FILE_PATH = "src/main/resources/input/day1.txt";
    private Safe safe;

    public AbstractDay1(Safe safe)  {
        this.safe = safe;
    }

    private List<String> loadInput() throws Exception {
        Path pathDay1 = Paths.get(INPUT_DAY1_FILE_PATH);
        return Files.lines(pathDay1).toList();
    }

    protected void printOutput() throws Exception {
        List<String> commands = loadInput();
        safe.rotate(commands);
        System.out.println("Final position: " + safe.getPosition());
        System.out.println("Number of times at zero: " + safe.getZeroClicks());
    }
}
