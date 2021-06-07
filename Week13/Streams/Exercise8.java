package Streams;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        //Write a Stream Expression to concatenate a Character list to a string!

        Optional<String> first = Optional.of("Hello");
        String second = "World";

        var concatenateString =
                first.stream()
                        .map(f -> f.concat(" " + second))
                        .collect(Collectors.toList());
        System.out.println(concatenateString);
    }
}
