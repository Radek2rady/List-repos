import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("src/duplicated-chars.txt");
    decrypt(filePath);
  }

  public static void decrypt(Path filePath) {
    ArrayList<String> wordList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(filePath);
      ;
      String words = null;
      for (int i = 0; i < lines.size(); i++) {
        words = lines.get(i);
        for (int j = 0; j < words.length(); j += 2) {
          char cleanWords = words.charAt(j);
     //     cleanWords = cleanWords + "\n";
          String cleanString = Character.toString(cleanWords);
          cleanString = cleanString;
          System.out.print(cleanString);
        }
        System.out.println();
      }
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }

}
