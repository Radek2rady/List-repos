import java.util.Scanner;

  public class DivideByZero {
    public static void main(String[] args) {
      System.out.println("Give the number: ");
      Scanner scanner = new Scanner(System.in);
      int divisor = scanner.nextInt();

      try {
        int result = 10 / divisor;
        System.out.println(result);
      } catch (ArithmeticException e) {
        System.out.println("Can't divide by zero!");
      }
    }
  }
