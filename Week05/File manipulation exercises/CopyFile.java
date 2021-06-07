import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    Path filenameSource = Paths.get("src/my-filesourc.txt");
    Path filenameTarget = Paths.get("src/my-filetarg.txt");

  CopyBetweenFiles (filenameSource, filenameTarget);
  }

  public static void CopyBetweenFiles (Path filenameSource, Path filenameTarget) {

    try {
      List<String> lines = Files.readAllLines(filenameSource);
      try {
        Files.write(filenameTarget, lines, StandardOpenOption.APPEND);
        System.out.println(0 == 0);
      }
      catch (NoSuchFileException e) {
        System.out.println(0 == 1);
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println(0 == 1);
    }

  }
}
