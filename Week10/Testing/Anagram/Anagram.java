package Testing.Anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";
        System.out.println(anagramCheck(a, b));
    }

    public static boolean anagramCheck(String a, String b) {
        boolean booltype = false;
        if (a.length() == b.length()) {
            char[] aArray = new char[a.length()];
            char[] bArray = new char[b.length()];
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            for (int i = 0; i < a.length(); i++) {
                if (aArray[i] != bArray[i]) {
                    booltype = false;
                } else {
                    booltype = true;
                }
            }
        }
        return booltype;
    }
}
