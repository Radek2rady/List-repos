public class Arrays {

  public static void main(String[] args) {


    int coffeesOnSunday = 6;

    int [] howManyCoffeesIDrank = {5, 2, 4, 10, 7, coffeesOnSunday};

//    for (int index = 0; index < howManyCoffeesIDrank.length ; index++) {
//      System.out.println(howManyCoffeesIDrank[index]);
//    }

    int [][] coffeesDrankInTheWeek = {
        {9, 11, 40, 3, 10},   // Ondra 0
        {0, 4, 7, 1, 2},      // Pavel 1
        howManyCoffeesIDrank, // me    2
        {0, 0, 0, 0, 0}       //       3
    };

//    for (int outerIndex = 0; outerIndex < coffeesDrank.length; outerIndex++) {
//
//      for (int innerIndex = 0; innerIndex < coffeesDrank[outerIndex].length; innerIndex++) {
//        System.out.print(coffeesDrank[outerIndex][innerIndex] + " ");
//      }
//      System.out.println();
//    }

    for (int [] lineOfCoffees : coffeesDrankInTheWeek) {
      for (int individualCoffeeAmount : lineOfCoffees ) {
        System.out.print(individualCoffeeAmount + " ");
      }
      System.out.println();
    }


  }
}
