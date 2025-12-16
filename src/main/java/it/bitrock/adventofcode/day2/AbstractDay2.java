package it.bitrock.adventofcode.day2;

import it.bitrock.adventofcode.day2.checker.IdCheckerPartOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public abstract class AbstractDay2 {
    private static final String INPUT_DAY2_FILE_PATH = "src/main/resources/input/day2.txt";
    private IdRangesExplorer idRangesExplorer;

    protected AbstractDay2(IdRangesExplorer idRangesExplorer) {
        this.idRangesExplorer = idRangesExplorer;
    }

    private List<String> loadInput() throws Exception {
        Path path = Paths.get(INPUT_DAY2_FILE_PATH);
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .flatMap(line -> Arrays.stream(line.split(",")))
                    .toList();
        }
    }

    public void printOutput() throws Exception{
        List<String> idRanges = loadInput();
        System.out.println("Sum of fully Wrongs IDs: " +idRangesExplorer.sumWrongIds(idRanges));
    }

}
