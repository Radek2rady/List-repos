package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        //Write a Stream Expression to get the even numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);


        var evenNumbers =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
