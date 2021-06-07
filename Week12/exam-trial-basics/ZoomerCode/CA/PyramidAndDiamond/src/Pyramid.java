import java.util.Scanner;

public class Pyramid {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    //get an input from the console
    System.out.println("Enter the height of the pyramid: ");
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    //print height of the pyramid
    for (int rows = 0; rows < height; rows++) {
      //decrease spaces
      for (int spaces = 0; spaces < height - rows; spaces++) {
        System.out.print(" ");
      }
      //increase stars
      for (int stars = 0; stars < 2 * rows + 1; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
