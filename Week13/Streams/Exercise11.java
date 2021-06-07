package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Exercise11 {
    public static void main(String[] args) {

        // Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order

        String filename = "src/Streams/wikirouletteco.txt";
        Path path = Paths.get(filename);

        try {

            var countWords =
                    Files.lines(Paths.get(filename))
                            .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                            .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                            .filter(word -> !word.isEmpty())
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                            .entrySet().stream().sorted((o1, o2) -> o2.getValue()
                            .compareTo(o1.getValue()))
                            .limit(100)
                            .collect(Collectors.toList());

            System.out.println(countWords);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
