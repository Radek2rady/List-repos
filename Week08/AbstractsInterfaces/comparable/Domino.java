package AbstractsInterfaces.comparable;

import java.util.*;

public class Domino implements Comparable<Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }


    @Override
    public int compareTo(Domino o) {
        return this.getLeftSide() - o.getLeftSide();
    }

}


//    public int compareToRight(Domino o) {
//        return this.right - o.right;
//    }



//      Arrays.sort(books, new Comparator<Book>() {
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o1.id.compareTo(o2.id);
//        }
//    });
//    System.out.println(Arrays.asList(books));
//}

//
//        if (this.left < o.left) {
//            return -1;
//        }
//        if (this.left == o.left) {
//            return 0;
//        }
//        return 1;
//    }

