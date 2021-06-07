package RetakeStudy.WhitespaceRemover;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WhitespaceRemover {
    public static void main(String[] args) throws Exception {
        String file = "src/RetakeStudy/input.txt";
        whitespaceRemover(file);

    }

    public static void whitespaceRemover(String file) throws Exception {
        var filePath = Paths.get(file);
        List<String> lines;
        List<String> cleanedLines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new Exception("File does not exist on the given path");
        }

        FileWriter myWriter = new FileWriter("output3.txt");
        for (int i = 0; i < lines.size(); i++) {
            cleanedLines.add(lines.get(i).replaceAll("\\s+", " "));
            myWriter.write(cleanedLines.get(i) + "\n");
        }

        myWriter.close();
    }
}