import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

  public static void main(String[] args) throws IOException {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    numbers("src/lottery.csv");

  }

  private static void numbers(String s) throws IOException {
    Path myPath = Paths.get(s);
    List<String> lineText = Files.readAllLines(myPath);

    String splText = lineText.toString();
    String[] splitText = splText.split(";");

    String[] justNumbers1 = new String[lineText.size()];
    String[] justNumbers2 = new String[lineText.size()];
    String[] justNumbers3 = new String[lineText.size()];
    String[] justNumbers4 = new String[lineText.size()];
    String[] justNumbers5 = new String[lineText.size()];
    String[] Numberss5 = new String[lineText.size()];    // Don't know why last number in wrong format. must split again

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    for (int i = 11; i < splitText.length; i += 15) {
      justNumbers1[count1] = splitText[i];
      count1++;
    }
    for (int i = 12; i < splitText.length; i += 15) {
      justNumbers2[count2] = splitText[i];
      count2++;
    }
    for (int i = 13; i < splitText.length; i += 15) {
      justNumbers3[count3] = splitText[i];
      count3++;
    }
    for (int i = 14; i < splitText.length; i += 15) {
      justNumbers4[count4] = splitText[i];
      count4++;
    }

    for (int i = 15; i < splitText.length; i += 15) {
      Numberss5[count5] = splitText[i];
      count5++;
    }
    String Numbers5 = Arrays.toString(Numberss5);
    String[] Nr5 = Numbers5.split(",");

    for (int i = 0; i < Nr5.length; i += 2) {
      justNumbers5[count6] = Nr5[i];
      count6++;
    }

    String[][] allNumberLottery = {justNumbers1, justNumbers2, justNumbers3, justNumbers4, justNumbers5};

    HashMap<String, Integer> resultHash = new HashMap<>();

    String trying;
    for (int i = 0; i < allNumberLottery.length; i++) {
      for (int j = 0; j < lineText.size(); j++) {
        trying = allNumberLottery[i][j];
        resultHash.compute(trying, (k, v) -> v == null ? 1 : v + 1);
      }
    }

    List<Integer> listValues = new ArrayList<Integer>(resultHash.values());
    Collections.sort(listValues, Collections.reverseOrder());
    List<Integer> top5 = listValues.subList(0, 5);
    Integer[] top5array = listValues.toArray(new Integer[top5.size()]);
    String[] top5keys = new String[5];
    int count = 0;
    for (Integer one : top5array) {
      for (Map.Entry<String, Integer> entry : resultHash.entrySet()) {
        if ((count < 5) && (one == entry.getValue())) {
          top5keys[count] = entry.getKey();
          count++;
        }
      }
    }
    System.out.println(Arrays.toString(top5keys));
  }
}
