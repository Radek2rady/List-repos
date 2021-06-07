import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Births {
  public static void main(String[] args) throws IOException {
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.
    birthsExcel("src/births.csv");
  }

  public static void birthsExcel(String file) throws IOException {
    int topYearfinal = 0;
    Path myPath = Paths.get(file);
    String[] wholeLine = null;
    String brDate = null;
    int yearTop = 0;
    List<String> lineText = Files.readAllLines(myPath);
    HashMap<Integer, Integer> mapYears = new HashMap<>();
    for (String line : lineText) {
      wholeLine = line.split(";");
      brDate = wholeLine[1].substring(0, 4);
      int year = Integer.parseInt(brDate);
      if (mapYears.containsKey(year)) {
        mapYears.replace(year, mapYears.get(year) + 1);
      } else {
        mapYears.put(year, 1);
      }
      for (int years : mapYears.keySet()) {
        if (mapYears.get(years) > yearTop) {
          yearTop = mapYears.get(years);
          topYearfinal = years;
        }
      }
    }
    System.out.println(yearTop);
    System.out.println(topYearfinal);
  }
}



