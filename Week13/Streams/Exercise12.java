package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise12 {
    public static void main(String[] args) {

        /* The swcharacters.csv file contains the list of characters appeared in the Star Wars universe.

"BBY" stands for Before the Battle of Yavin, it's the "year zero" in the Galactic Standard Calendar. For the age calculation let's assume that it's "year zero" and every character lives for the sake of simplicity.

Create Stream expressions to perform the following exercises:

Print the name of the heaviest character (if the mass is unknown, ignore that character)
Print the average height of the male characters
Print the average height of the female characters
💪 Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
The result should be a Map<String, Map<String, Integer>> */

        Map<String, Integer> mapHeaviestCharacter = null;
        Map<String, Integer> mapAverageMale = null;
        Map<String, Integer> mapAverageFemale = null;
        Map<String, Map<String, Integer>> mapCharactersAge = null;


        List<String> content = null;

        try {
            content = Files.readAllLines(Paths.get("src/Streams/swcharacters.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        mapCharactersAge =
                content.stream()
                        .skip(1)
                        .map(line -> line.split(";"))
                        .map(line -> new String[]{line[6].replaceAll("BBY", ""), !line[7].contains("male") && !line[7].contains("female") ? "other " : " " + line[7] + " "})
                        .collect(Collectors.groupingBy(s -> {
                                    if (s[0].equals("unknown")) return "unknown: ";
                                    else if (Double.parseDouble(s[0]) < 21.0) return "below 21: ";
                                    else if (Double.parseDouble(s[0]) < 40.0) return "between 21 and 40: ";
                                    else return "above 40: ";
                                },
                                Collectors.groupingBy(s -> s[1], Collectors.reducing(0, s -> 1, Integer::sum))));

        System.out.println(mapCharactersAge);

        mapHeaviestCharacter =
                content.stream()
                        .skip(1)
                        .map(line -> line.split(";"))
                        .filter(line -> !line[1].equals("unknown"))
                        .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[1])));


        mapAverageMale =
                content.stream()
                        .map(line -> line.split(";"))
                        .filter(line -> line[7].equals("male"))
                        .filter(line -> !line[1].equals("unknown"))
                        .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[1])));


        mapAverageFemale =
                content.stream()
                        .skip(1)
                        .map(line -> line.split(";"))
                        .filter(line -> line[7].equals("female"))
                        .filter(line -> !line[1].equals("unknown"))
                        .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[1])));


        mapHeaviestCharacter.entrySet()
                .stream().sorted(Map.Entry.comparingByValue((a1, a2) -> a2 - a1))
                .limit(1)
                .forEach(name -> System.out.println("Heaviest character: " + name.getKey()));

        double averageMaleCount =
                mapAverageMale.entrySet().stream().filter(x -> x.getValue() > 0).mapToInt(x -> x.getValue()).sum();
        double averageMale = averageMaleCount / mapAverageMale.size();
        System.out.println("Average height of the male characters : " + String.format("%.2f", averageMale));

        double averageFemaleCount =
                mapAverageFemale.entrySet().stream().filter(x -> x.getValue() > 0).mapToInt(x -> x.getValue()).sum();
        double averageFemale = averageFemaleCount / mapAverageFemale.size();
        System.out.println("Average height of the female characters : " + String.format("%.2f", averageFemale));


    }
}
