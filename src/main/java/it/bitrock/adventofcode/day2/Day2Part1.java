package it.bitrock.adventofcode.day2;

import it.bitrock.adventofcode.day2.checker.IdCheckerPartOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day2Part1 {
    private static final String INPUT_DAY2_FILE_PATH = "src/main/resources/input/day2.txt";

    private List<String> loadInput() throws Exception {
        Path path = Paths.get(INPUT_DAY2_FILE_PATH);
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .flatMap(line -> Arrays.stream(line.split(",")))
                    .toList();
        }
    }

    public static void main(String[] args) throws Exception {
        Day2Part1 day2Part1 = new Day2Part1();
        List<String> idRanges = day2Part1.loadInput();
        // System.out.println("Loaded " + idRanges + " idRanges");
        IdRangesExplorer idRangesExplorer = new IdRangesExplorer(new IdCheckerPartOne());
        System.out.println("Sum of fully Wrongs IDs: " +idRangesExplorer.sumWrongIds(idRanges));
    }
}
