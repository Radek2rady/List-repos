package OOP.Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;
    int captainRum;
    private int allivePirates;

    public Ship() {
        this.crew = new ArrayList<>();
    }

    Random random = new Random();

    interface myInterface {
        void setCaptain();
    }

    public void fillShip() {
        Captain captain = new Captain();
        crew.add(captain);

        for (int i = 0; i < random.nextInt(30); i++) {
            crew.add(new Pirate());
        }

        captain.drinkSomeRum();

        System.out.println("Ship has crew " + crew.size() + " pirates. Captain drinked " + captain.getCounterRum());
    }

    public boolean battle(Ship otherShip) {
        Captain captain = new Captain();
        int deaths;

        boolean result = true;
        int shipScore = this.crew.size() - this.captainRum;
        int otherShipScore = otherShip.crew.size() - otherShip.captainRum;
        if (shipScore > otherShipScore) {
            deaths = random.nextInt(otherShip.crew.size());
            int partyRum = random.nextInt(this.crew.size());
            System.out.println("We won. We killed " + deaths + ". During the party drinked " + partyRum + " rum.");
            result = true;
        } else {
            deaths = random.nextInt(this.crew.size());
            int partyRum = random.nextInt(otherShip.crew.size());
            this.captainRum += (int)partyRum / crew.size();
            System.out.println("We lose. They killed " + deaths + ". During the party drinked " + partyRum + " rum.");
            result = false;
        }
        return result;
    }
}
