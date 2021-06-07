package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {


//        Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!


        List<Fox> foxes = new ArrayList<>();
        Fox fox1 = new Fox("Bloody Fox", "grey", 3);
        Fox fox2 = new Fox("Hungry Fox", "green", 6);
        Fox fox3 = new Fox("Death Fox", "pink", 2);
        Fox fox4 = new Fox("Fast Fox", "green", 4);
        Fox fox5 = new Fox("Running Fox", "white", 10);
        Fox fox6 = new Fox("Fly Fox", "orange", 4);
        Fox fox7 = new Fox("Bad Fox", "brown", 5);
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);
        foxes.add(fox6);
        foxes.add(fox7);

        var greenFoxes =
                foxes.stream()
                        .filter(fox -> fox.getColor().equals("green"))
                        .map(Fox::getName)
                        .collect(Collectors.toList());

        System.out.println(greenFoxes);

        var greenFoxesUnderFive =
                foxes.stream()
                        .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
                        .map(Fox::getName)
                        .collect(Collectors.toList());

        System.out.println(greenFoxesUnderFive);


        foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()))
                .entrySet().stream() // .max(Map.Entry.comparingByValue())
                .forEach(v -> System.out.println(v.getKey() + ", " + v.getValue()));

    }



    public static class Fox {
        private String name;
        private String color;

        private int age;

        public Fox(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getAge() {
            return age;
        }


//      https://stackoverflow.com/questions/43616422/find-the-most-common-attribute-value-from-a-list-of-objects-using-stream
//        String mostCommonTag = getPerson().stream()
//                // filter some person without a tag out
//                .filter(it -> Objects.nonNull(it.getTag()))
//                // summarize tags
//                .collect(Collectors.groupingBy(Person::getTag, Collectors.counting()))
//                // fetch the max entry
//                .entrySet().stream().max(Map.Entry.comparingByValue())
//                // map to tag
//                .map(Map.Entry::getKey).orElse(null);
//        AND the getTag method appeared twice, you can simplify the code as further:
//
//        String mostCommonTag = getPerson().stream()
//                // map person to tag & filter null tag out
//                .map(Person::getTag).filter(Objects::nonNull)
//                // summarize tags
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                // fetch the max entry
//                .entrySet().stream().max(Map.Entry.comparingByValue())
//                // map to tag
//                .map(Map.Entry::getKey).orElse(null);

    }
}
