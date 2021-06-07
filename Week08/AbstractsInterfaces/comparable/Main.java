package AbstractsInterfaces.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

        // First compare the first value and then the second
// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]

//        System.out.println("Result 1 - left side: ");
//        for (Domino dom: dominoes) {
//            System.out.println(dom);
//        }

        System.out.println("Result 1 - left side: ");
        for (Domino dom: dominoes) {
            System.out.println("[" + dom.getLeftSide() + ", " + dom.getRightSide() + "]");
        }

//        System.out.println("Result 2 - right side: ");
//        for (Domino dom: dominoes) {
//            System.out.println("[" + dom.getRightSide() + ", " + dom.getLeftSide() + "]");
//        }
        
   dominoes.sort(Comparator.comparingInt(Domino::getRightSide));
            System.out.println("Result 2 - right side: ");
            for (Domino dom: dominoes) {
                System.out.println("[" + dom.getLeftSide() + ", " + dom.getRightSide() + "]");
            }
        }




//        System.out.println("Result 1 - left side");
//        System.out.println(dominoes);
//
//
//
//        System.out.println("Result 2 - right side");
//        Collections.sort(dominoes, Comparator.comparingInt(Domino::getRightSide));
//        System.out.println(dominoes);

    }
