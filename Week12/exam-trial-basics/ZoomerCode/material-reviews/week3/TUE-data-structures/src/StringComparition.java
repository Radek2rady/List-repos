import java.util.Arrays;

public class StringComparition {

  public static void main(String[] args) {
//    whyYouShoudUseAlwaysEquals();
//    whatIsCompare();
    String s = "apple, pear, banana";
    String[] elements = s.split(", ");
    System.out.println(Arrays.toString(elements));
  }

  private static void whatIsCompare() {
    checkAlphabeticalOrder("apple", "pear");
  }

  private static void checkAlphabeticalOrder(String s1, String s2) {
    int result = s1.compareTo(s2);
    if (result < 0) {
      System.out.println(String.format("%s is sooner in alphabetical order than %s", s1, s2));
    } else if (result == 0) {
      System.out.println(String.format("%s is equal to %s", s1, s2));
    } else {
      System.out.println(String.format("%s is sooner in alphabetical order than %s", s2, s1));
    }
  }

  private static void whyYouShoudUseAlwaysEquals() {
    String s1 = "apple";
    String s2 = "ap" + "ple";
    String s3 = "ap";
    s3 += "ple";
    String s4 = "apple";

    System.out.println(s1.equals(s3));
//    System.out.println(s2);
//    System.out.println(s3);
  }

}
