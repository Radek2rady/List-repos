package Testing.CountLetters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        String a = "hastalavista";

        System.out.println(countLetters(a));
    }

    public static Map countLetters(String a) {
        Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            if (dictionary.containsKey(a.charAt(i))) {
                int currentValue = dictionary.get(a.charAt(i));
                dictionary.put(a.charAt(i), currentValue + 1);
            } else {
                dictionary.put(a.charAt(i), 1);
            }
        }
      return dictionary;
    }
}
