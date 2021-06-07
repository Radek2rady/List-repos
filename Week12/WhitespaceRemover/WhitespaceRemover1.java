package RetakeStudy.WhitespaceRemover;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WhitespaceRemover1 {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("src/RetakeStudy/input.txt");
        whitespaceRemover(filePath);

    }

    public static void whitespaceRemover(Path filePath) throws Exception {
        List<String> lines;
        String linesString;

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new Exception("File does not exist on the given path");
        }
        linesString = lines.toString();
        linesString = String.format(linesString.replaceAll("\\s+", " ").toString());
        var linesSplit = linesString.split(",");

        FileWriter myWriter = new FileWriter("src/RetakeStudy/output1.txt");
        for (var line : linesSplit) {
            if (!line.isEmpty())
                myWriter.write(line + "\n");
        }
        myWriter.close();

        System.out.println(linesSplit.toString());

    }
}