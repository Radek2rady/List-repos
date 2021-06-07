package OOP.Pirates;

import java.util.Random;

public class Captain extends Pirate {
    private int counterRum;

    public Captain() {
        this.getCounterRum();
    }

    Random random = new Random();

    public int getCounterRum() {
        return counterRum;
    }

    public void drinkSomeRum() {
        this.counterRum = rand.nextInt(4);
    }

}
