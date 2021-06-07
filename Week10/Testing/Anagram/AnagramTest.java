package Testing.Anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagram() {
        String a = "silent";
        String b = "listen";
        assertEquals(true, Anagram.anagramCheck(a, b));
    }

    @Test
    public void anagramEmptyFirstString() {
        String a = "";
        String b = "listen";
        assertEquals(false, Anagram.anagramCheck(a, b));
    }

    @Test
    public void anagramEmptySecondString() {
        String a = "silent";
        String b = "";
        assertEquals(false, Anagram.anagramCheck(a, b));
    }
}