import java.util.ArrayList;
import java.util.List;

public class personalFinance {
  public static void main(String[] args) {

    Integer[] expenses = {500, 1000, 1250, 175, 800, 120};
    System.out.println("We spent: " + total(expenses));
    System.out.println("Greatest expense: " + maximum(expenses));
    System.out.println("Cheapest expense: " + lowest(expenses));
    System.out.println("Average we spent: " + aver(expenses));


  }

  public static int total(Integer[] expenses) {
    int sum = 0;
    int average = 0;
    for (int nr : expenses) {
      sum += nr;
      average = sum / expenses.length;
    }
    return sum;
  }

  public static int maximum(Integer[] expenses) {
    int greatest = 0;
    for (int nr : expenses) {
      if (nr > greatest) {
        greatest = nr;
      }
    }
    return greatest;
  }

  public static int lowest(Integer[] expenses) {
    int smallest = 0;
    for (int nr : expenses) {
      if ((smallest > nr) && (smallest != 0)) {
        smallest = nr;
      } else if (smallest == 0) {
        smallest = nr;
      }
    }
    return smallest;
  }

  public static int aver(Integer[] expenses) {
    int sum = 0;
    int average = 0;
    for (int nr : expenses) {
      sum += nr;
      average = sum / expenses.length;
    }
    return average;
  }
}

