package MostCommonCharacters;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/MostCommonCharacters/countchar.txt");
        mostCommonChar(file);
    }

    public static String mostCommonChar(File file) throws IOException {
        String st = null;
        char ch;
        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }


        for (int i = 0; i < st.length(); i++) {
            ch = st.charAt(i);
            if (charCounter.containsKey(ch)) {
                charCounter.put(ch, charCounter.get(ch) + 1);
            } else {
                charCounter.put(ch, 1);
            }
        }
        return charCounter.toString();
    }
}
// System.out.println(charCounter.toString());

