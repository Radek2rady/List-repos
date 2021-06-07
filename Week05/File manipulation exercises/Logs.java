import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    Path filePath = Paths.get("src/log.txt");
    readLogs(filePath);
    getPostRatio(filePath);
  }

  private static void readLogs(Path filePath) {
    List<String> lines = null;
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    ArrayList<String> adresses = new ArrayList<>();
    String stringLine = null;
    String[] wholeLine = null;
    String IPs = null;
    for (int i = 0; i < lines.size(); i++) {
      stringLine = lines.get(i);
      wholeLine = stringLine.split("  ", 11);
      IPs = wholeLine[2];
      adresses.add(IPs);
    }
    for (String element : adresses) {
      System.out.println(element);
    }
  }

  public static void getPostRatio(Path filePath) {
    String choice = null;
    List<String> lines = null;
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    ArrayList<String> adresses = new ArrayList<>();
    String stringLine = null;
    String[] wholeLine = null;
    int countGet = 0;
    int countPost = 0;
    for (int i = 0; i < lines.size(); i++) {
      stringLine = lines.get(i);
      wholeLine = stringLine.split("  ", 11);
      choice = wholeLine[3];
      if (choice.contains("GET")) {
        countGet++;
      } else if (choice.contains("POST")) {
        countPost++;
      }
    }
    System.out.println("Logs POST: " + countPost);
    System.out.println("Logs GET: " + countGet);
  }
}



