package it.bitrock.adventofcode.day3;

import it.bitrock.adventofcode.day1.safe.Safe;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public abstract class AbstractDay3 {
    private static final String INPUT_DAY1_FILE_PATH = "src/main/resources/input/day3.txt";


    public AbstractDay3(/*Safe safe*/)  {
        /*this.safe = safe;*/
    }

    private List<String> loadInput() throws Exception {
        Path pathDay1 = Paths.get(INPUT_DAY1_FILE_PATH);
        return Files.lines(pathDay1).toList();
    }

    protected void printOutput() throws Exception {
        List<String> banks = loadInput();
        System.out.println("Number of banks: " + banks.size());
        //safe.rotate(commands);
        //System.out.println("Final position: " + safe.getPosition());
        //System.out.println("Number of times at zero: " + safe.getZeroClicks());
    }
}
