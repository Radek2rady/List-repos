import java.util.Scanner;

public class Diamond {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    //get the height of the diamond from the user
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    //draw upper half (+1 line if its odd)
    int extraLine = height % 2;
    for (int rows = 0; rows < height / 2 + extraLine; rows++) {
      for (int spaces = 0; spaces < height / 2 - rows ; spaces++) {
        System.out.print(" ");
      }
      for (int stars = 0; stars < 2 * rows + 1; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //draw lower half (upside down pyramid)
    for (int rows = height / 2; rows > 0; rows--) {
      for (int spaces = 0; spaces < height / 2 - rows + 1; spaces++) {
        System.out.print(" ");
      }

      for (int stars = 0; stars < 2 * rows - 1; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
