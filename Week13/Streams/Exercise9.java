package Streams;

import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;

public class Exercise9 {
    public static void main(String[] args) {

        //Write a Stream Expression to find the frequency of characters in a given string!

   String string = "All I Really Need to Know I Learned in Kindergarten";

        Map<Character, Integer> frequencies = string.chars().boxed()
                .collect(toMap(
                // key = char
                k -> Character.valueOf((char) k.intValue()),
                v -> 1,         // 1 occurence
                Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);


    }
}
