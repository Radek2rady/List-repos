package Testing.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(8);

        System.out.println(sum(list));
    }

    public static int sum(List list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
          //  sum += list.get(i)
        }
        return sum;
    }
}
