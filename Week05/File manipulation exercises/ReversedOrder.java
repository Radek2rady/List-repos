import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    Path filePath = Paths.get("src/reversed-order.txt");
    revese(filePath);
  }

  public static void revese(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = lines.size() - 1; i >= 0; i--) {
        String reversed = lines.get(i);
        System.out.println(reversed);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
