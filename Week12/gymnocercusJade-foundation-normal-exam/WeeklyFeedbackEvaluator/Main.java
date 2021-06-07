package gymnocercusJadeFoundationNormalExamWeeklyFeedbackEvaluator;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //   Path myPath = Paths.get("responses.txt");
        Scanner input = new Scanner(new File("src/gymnocercusJadeFoundationNormalExamWeeklyFeedbackEvaluator/responses.txt"));
        int[][] a = new int[0][];
      //  matrixFromFile(Scanner input);
        System.out.println(matReview(a));
    }

    public static void matrixFromFile(Scanner input) throws FileNotFoundException {

        int rows = 0;
        int columns = 0;
        while (input.hasNextLine()) {
            ++rows;
            Scanner colReader = new Scanner(input.nextLine());
            while (colReader.hasNextInt()) {
                ++columns;
            }
        }
        int[][] a = new int[rows][columns];

        input.close();

        input = new Scanner(new File("src/gymnocercusJadeFoundationNormalExamWeeklyFeedbackEvaluator/responses.txt"));
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (input.hasNextInt()) {
                    a[i][j] = input.nextInt();
                }
            }
        }
    }

    public static double matReview(int[][] a) {
      //  matrixFromFile(a);
        double mathRating = 0;
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[0][j];
            }
        }
        return mathRating = sum / a[0].length;
    }
}
