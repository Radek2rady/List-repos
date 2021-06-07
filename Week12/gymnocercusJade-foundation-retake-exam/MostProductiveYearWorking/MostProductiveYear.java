package retake.MostProductiveYear;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MostProductiveYear {
    public static void main(String[] args) throws Exception {


        String marvel = "marvel";
        String paramount = "paramount";
        String ghibli = " ";

        System.out.println(mostProductiveYear(marvel));
        System.out.println(mostProductiveYear(paramount));
        System.out.println(mostProductiveYear(ghibli));
    }

    public static Integer mostProductiveYear(String studio) throws Exception {
        List<String> lines;
        String file = " ";
        String[] splittedLine;
        Map<Integer, Integer> hashYear = new HashMap<Integer, Integer>();

        if (studio == "marvel") {
            file = "src/retake/marvel.csv";
        } else if (studio == "paramount") {
            file = "src/retake/paramount.csv";
        } else {
            file = "otherFile";
        }
        var filePath = Paths.get(file);

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new Exception("Cannot find studio" + studio + "ghibli " + "please try again later.");
        }

        ArrayList<Integer> splittedLines = new ArrayList<Integer>(lines.size());

        for (var line : lines) {
            splittedLine = line.split(",");
            splittedLines.add(Integer.parseInt(splittedLine[1]));
        }


        for (int i = 0; i < splittedLines.size(); i++) {
            if (hashYear.containsKey(splittedLines.get(i))) {
                int valueOfYear = hashYear.get(splittedLines.get(i));
                hashYear.put(splittedLines.get(i), valueOfYear + 1);
            } else {
                hashYear.put(splittedLines.get(i), 1);
            }
        }

        Integer maxYear = 0;
        for (Integer year : hashYear.keySet()) {
            if (maxYear == 0 || hashYear.get(year) > hashYear.get(maxYear)) {
                maxYear = year;
            }
        }

        return maxYear;
    }
}
