package OOP.Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pirate {
    int counterRum;
    String name;
    private boolean passedOut;
    private boolean dead;

    public Pirate() {
        this.passedOut = false;
        this.dead = false;
    }

    Random rand = new Random();

    public Pirate(String name, int counterRum) {
        this.name = name;
    }

    public void drinkSomeRum() {
        this.counterRum = rand.nextInt(4);
    }

    public void howsItGoingMate() {
        if ((counterRum < 4) || (counterRum > 5 && counterRum < 8)) {
            System.out.println("Pour me anudder!");
            this.counterRum++;
        } else if ((counterRum == 4) || (counterRum == 8)) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public void die() {
        if (counterRum >= 10) {
            this.dead = true;
            System.out.println("he's dead");
        }
    }

    public void brawl(Pirate otherPirate) {
        int randInt = rand.nextInt(3);
        if (!otherPirate.dead) {
            if (otherPirate.counterRum < 10) {
                if (randInt == 0) {
                    System.out.println("fighter died");
                    otherPirate.dead = true;
                } else if (randInt == 1) {
                    System.out.println("defender died");
                    this.dead = true;
                } else {
                    System.out.println("Both passed out");
                    this.passedOut = true;
                    otherPirate.passedOut = true;
                }
            }
        }
    }

    public void parrot() {
        System.out.println("parrot came");
    }
}
