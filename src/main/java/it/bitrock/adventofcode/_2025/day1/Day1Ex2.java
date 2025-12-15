package it.bitrock.adventofcode._2025.day1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1Ex2 {
    private final static String INPUT_DAY1_FILE_PATH = "src/main/resources/input/day1-ex1.txt";

    private Safe safe = new Safe();

    public Day1Ex2()  {
    }

    public List<String> loadInput() throws Exception {
        Path pathDay1 = Paths.get(INPUT_DAY1_FILE_PATH);
        return Files.lines(pathDay1).toList();
    }

    public void printOutput() throws Exception {
        List<String> commands = loadInput();
        safe.rotate(commands);
        System.out.println("Final position: " + safe.getPosition());
        System.out.println("Number of times at zero: " + safe.getZeroClicks());
    }

    static void main() throws Exception {
        Day1Ex2 day1 = new Day1Ex2();
        day1.printOutput();
    }

}
