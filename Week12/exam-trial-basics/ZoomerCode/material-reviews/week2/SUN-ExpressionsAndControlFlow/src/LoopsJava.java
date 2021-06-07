import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsJava {
  public static void main(String[] args) {

    //Write Hello World 10 times without loops
   /* System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");*/

    //For loop
    // START       STOP    STEP
    for(int i = 0; i < 10; i++){
      System.out.println("Hello World");
    }
    for (int i = 0; i <10 ; i--) { //infinite loop never stops
      System.out.println("Actual value is " + i);
    }

    for (byte i = 0; i < 127; i--) { // underflow
      System.out.println("Actual value of i is " + i);
    }

    System.out.println();
    int value = Integer.MAX_VALUE-1;
    for(int i = 0; i < 4; i++, value++) { //OVERFLOW if reaches the max value
      System.out.println("Actual value of value is " + value);
    }

    //WHILE
    Scanner sc = new Scanner(System.in);
    System.out.println("Provide me a number");
    int inputFirst = sc.nextInt();
    while (inputFirst < 20){
      System.out.println(inputFirst);
      inputFirst++;
    }

    //do the same with for loop
    for (int i = inputFirst; i < 20; i++) {
      System.out.println(inputFirst);
    }

    //SCOPE
    for (int i = 0; i <10 ; i++) {
      System.out.println(i);
      int number = 0; //inside for loop's scope will not be seen outside
    }

    int number = 0; //outside of the for loop can be seen afterwards

    // DO WHILE

    Scanner sc2 = new Scanner(System.in);
    System.out.println("Provide me a number");
    int i = sc2.nextInt();
    do {
      System.out.println(i);
      i++;
    }while (i < 20);


    //NESTED FOR LOOP

    int n4 = 5;
    int n5 = 3;
    for (int j = 0; j < n4; j++) {
      for (int k = 0; k <n5 ; k++) {
        System.out.print("*");
      }
      System.out.println();
    }


    for (int j = 0; j <3; j++) {
      System.out.println("Start of the outer loop Value of j is " + j);
      for (int k = 0; k <3; k++) {
        System.out.println("Start of the outer loop Value of j is " + j + " Value of k is " + k);
      }
      System.out.println("END of outer loop value of j is " + j);
      System.out.println();
    }

    boolean isNumberProvided = false;
    do {
      try{
        Scanner scanner = new Scanner(System.in);  // THIS ONE IS FOOL SAFE NOW
        System.out.println("Please provide me a number");
        int input = scanner.nextInt();
        System.out.println("The provided input is " + (input + 5));
        isNumberProvided=true;
      }catch (InputMismatchException e){
        System.out.println("Please do not provide anything else but a whole number");
      }
    }while (!isNumberProvided);

  }
}
