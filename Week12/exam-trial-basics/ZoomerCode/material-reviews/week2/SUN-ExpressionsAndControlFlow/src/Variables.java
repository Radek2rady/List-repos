import java.math.BigDecimal;

public class Variables {
  public static void main(String[] args) {

    //PRIMITIVE DATATYPES
    // System.out.println("Hello World!");
    int number = 5; //declated and defined(value has been assigned to it)
    int number2; //declared but no value assigned
    //System.out.println("Value of number is " + number + "Value for number2 is " + number2); -> compile error

    number = 10; //reassigning value to the variable

    byte b = 127; //range of byte is from -128 till 127 _ _ _ _ _ _ _ _ -> first one say if negative or positive -> 1 byte
    short s = 32000; // 2 bytes -> 2 on the 16th
    int i = 35555555; // 4 bytes -> 2 on the 32
    long l = 33444453666L; // 8 bytes -> 2 on the 64
    l =i; //good
   // i = l; //not good

    // 1 Mio variables -> byte ~ 1MB, long -> 8MB

    double d = 56.266; //not whole bigger
    float f = 56.266666342324432444444f; // not whole smaller

    char a = 66; // each character has a numberic value as well
    char c = 'c';
    System.out.println(b);

    String str;

    boolean bool = true;


    double amount = 56.99;
    System.out.println("Double Amount is " + amount);
    int castedAmount = (int) (amount); // casting: change a number to another type of number
    System.out.println("Casted Amount is " + castedAmount);

    String booleanString = "5"; //String is not primitive type

    boolean convertStringToBoolean = Boolean.parseBoolean(booleanString); // Convert String to boolean
   System.out.println("Converted Value is " + convertStringToBoolean);

    int number3 = Integer.parseInt(booleanString); //will not work -> can not give a numeric value to true
    System.out.println(5 + number3); //adds together the numbers
    System.out.println("The result of the addition is " + 5 + number3); //converts numbers to String and does not add them together
    System.out.println("The result of the addition is " + (5 + number3)); //does the summing first in the bracket
    System.out.println(5 + number3); //does the summing



  }
}
