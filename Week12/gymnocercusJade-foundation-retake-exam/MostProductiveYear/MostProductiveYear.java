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
        mostProductiveYear(paramount);
        mostProductiveYear(ghibli);
    }

    public static Integer mostProductiveYear(String studio) throws Exception {
        List<String> lines;
        String file = " ";
        String[] splittedLine;
        Map<Integer, Integer> hashYear = new HashMap<Integer, Integer>();

        if (studio == "marvel") {
            file = "src/retake/marvel.csv";
        } else if (studio == "Paramount") {
            file = "src/retake/paramount.csv";
        }
        var filePath = Paths.get(file);

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new Exception("Cannot find studio --studio name--, please try again later.");
        }

        ArrayList<Integer> splittedLines = new ArrayList<Integer>(lines.size());
        for (var l : lines) {
            splittedLine = l.split(",");
            splittedLines.add(Integer.parseInt(splittedLine[1]));


            for (int i = 0; i < splittedLines.size(); i++) {
                Integer count = hashYear.get(splittedLines);
                hashYear.put(i, count != null ? count + 1 : 1);
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
