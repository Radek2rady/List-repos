// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class CountLine {
  public static void main(String[] args) {
    try {
      {
        Path filePath = Paths.get("src/my-file.txt");
        List<String> lines = Files.readAllLines(filePath);
        ;
        int count = 0;
        for (String line : lines)
          count++;
        lines = Files.readAllLines(filePath);

        System.out.println(count);
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Zero");

    }
  }
}

