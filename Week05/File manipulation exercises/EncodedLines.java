import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts encoded-lines.txt

    decode("src/encoded-lines.txt");
  }

  private static void decode(String s) throws IOException {
    Path myPath = Paths.get(s);
    List<String> lineText = Files.readAllLines(myPath);
    String textTemp = null;
    List<String> textDecrypt = new ArrayList<String>();
    String lineString = lineText.toString();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ[],-.+*'()./!\"".toCharArray();
    // String alphabetString = alphabet.toString();
    // String[] text = lineString.split(" ");
    // String textString = Arrays.toString(text);
    int indexChar = 0;
    char newChar;
    char deleting;
    String newCharStr;
    String cleanText;
    String letter;
    for (int i = 1; i < lineString.length() - 1; i++) {
      char c = lineString.charAt(i);
      if ((c == ' ') || (c == ',')) {
        c = ' ';
        newChar = c;
        newCharStr = Character.toString(newChar);
        textDecrypt.add(newCharStr);
      } else {
        if (c == 'a') {
          newChar = c;
          newCharStr = Character.toString(newChar);
          textDecrypt.add(newCharStr);
        } else {
          indexChar = new String(alphabet).indexOf(c);
          newChar = new String(alphabet).charAt(indexChar - 1);
          newCharStr = Character.toString(newChar);
        }

        // newCharStr.replace(",", "").replace("[", "").replace("]", "");
        textDecrypt.add(newCharStr);
       // deleting = textDecrypt.toString();
      }

    }
    for (int i = 0; i < textDecrypt.size(); i++) {
      letter = textDecrypt.get(i);
   //   deleting = letter.charAt(i);
    //  if (letter.charAt(i) != ',') {
        cleanText = textDecrypt.get(i);
        System.out.print(cleanText.toString());
      }
    }

  }

