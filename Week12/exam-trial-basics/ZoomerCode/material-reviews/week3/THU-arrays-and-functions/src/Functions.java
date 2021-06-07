import java.util.Scanner;

public class Functions {

  static int counter = 0;

  public static void main(String[] args) {

    System.out.println(counter);

    String greetingText = createGreetingText("Peter", 30);
    System.out.println(greetingText);

    System.out.println(counter);

    String greetingText2 = createGreetingText("Ondra");
    System.out.println(greetingText2);

    System.out.println(counter);

  }

  public static void sayHello() {
    System.out.println("Hello!");
  }
  public static void sayGoodbye() {
    System.out.println("Goodbye!");
  }

  public static String createGreetingText(String name, int age) {
    counter++;
    return name + " (age " + age + ") just ate a hamburger";
  }

  public static String createGreetingText(String name) {
    counter++;
    return name + " just ate a taco";
  }

  public static void print2DArray (int [][] twoDimensionalArray) {
    // Up to you to figure this one out :)
  }

}
