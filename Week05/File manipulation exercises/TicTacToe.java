import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String filename) {
    String flPath = "src/" + filename;
    String answer = null;
    String line = null;
    char[] letters = new char[9];
    int count = 0;
    try {
      BufferedReader reader = new BufferedReader(new FileReader(flPath));
      while ((line = reader.readLine()) != null)
        for (int i = 0; i < line.length(); i++) {
          letters[count] = line.charAt(i);
          count++;
        }
    } catch (IOException e) {
      e.printStackTrace();
    }

    boolean nowin;
    while (nowin = true) {
      for (int i = 0; i < letters.length - 1; i++) {

        if ((i == 0) || (i == 3) || (i == 6)) {

          if ((letters[i] == letters[i + 1]) && (letters[i + 1] == letters[i + 2])) {
            answer = Character.toString(letters[i]);
            nowin = false;
          }
        }
        if ((i == 0) || (i == 1) || (i == 2)) {
          if ((letters[i] == letters[i + 3]) && (letters[i + 3]) == (letters[i + 6])) {
            answer = Character.toString(letters[i]);
            nowin = false;
          }
          nowin = false;
        }
        if (i == 0) {
          if ((letters[i] == letters[i + 4]) && (letters[i + 4]) == (letters[i + 8])) {
            answer = Character.toString(letters[i]);
            nowin = false;
          }
          nowin = false;
        }
        if (i == 2) {
          if ((letters[i] == letters[i + 2]) && (letters[i + 2]) == (letters[i + 4])) {
            answer = Character.toString(letters[i]);
            nowin = false;
          }
          nowin = false;
        } else if (answer == null) {
          answer = "Draw";
          nowin = false;
        }
        nowin = false;
      }
      nowin = false;
      break;
    }
    return answer;
  }
}



