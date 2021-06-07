package OOP.DiceSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DS diceSet = new DS();
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.getCurrent(5));
        diceSet.reroll();
        System.out.println(diceSet.getCurrent());
        diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());


        int total = 0;
        int count = 0;
        DS notSixSet = new DS();
        for (int i = 0; i < diceSet.dice.size(); i++) {
            while (diceSet.getCurrent(i) < 6) {
                total += i;
                count++;
                if (diceSet.getCurrent(i) != 6) {
                    diceSet.reroll(i);
                    count++;
                }
            }
   //         System.out.println(total);
            System.out.println(count);
        }
    }
}

