import java.io.IOException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    Path filePath = Paths.get("src/reversed-lines.txt");
    revese(filePath);
  }

  public static void revese(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size() - 1; i++) {
        String words = lines.get(i);
      //  lines =  lines + "\n";
        for (int j = words.length() - 1; j >= 0; j--) {
          char chars = words.charAt(j);

          String correct = Character.toString(chars);
          System.out.print(correct);
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
