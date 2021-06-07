public class Operators {
  public static void main(String[] args) {
    //Arithmetic operators +-/*%
    int number1 = 5;
    int number2 = 10;

    System.out.println(number1 + number2);
    System.out.println(number1 - number2);
    System.out.println((double) number1 / number2);
    System.out.println(number1 * number2);
    System.out.println(number1 % number2);

    //unary operator ++ --
    System.out.println(++number1);
    System.out.println(number1++);
    System.out.println(number1);

    number2 +=2; //increases the value by two
    number2 = number2 + 2; //does the same

    int a = 4;

    if (a % 2 != 0){
      System.out.println("A is odd");
    }else{
      System.out.println("A is even");
    }

    String hello = "Hello";
    String world = "World";
    System.out.println(hello + world); // you can only add String to each other
    //System.out.println(hello - world); Will not work

    //Logical Operators &&(and) and ||(or) and ! (not)

    int n1 = 5;
    int n2 = 10;
    if (n1 > 10 && n2 >10){ //if both sides are true
      System.out.println("Both of them are bigger than 10");
    }else if (n1 > 10 || n2 > 10){
      System.out.println("One of them is bigger than 10");
    }else{
      System.out.println("None of them are bigger than 10");
    }

    boolean checkEquality = 10 == 5;
    System.out.println(checkEquality);

    int n3 = n2 =n1;
    System.out.println(n3);
    System.out.println(n2);
    String name = "Katerina";
    if (checkEquality){
      System.out.println("CheckEquality is true");
    }else{
      System.out.println("CheckEquality is false");
    }
  }
}
