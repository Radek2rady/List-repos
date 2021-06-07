package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;

    public Ship() {
        this.crew = new ArrayList<>();
    }

    Random random = new Random();


    public void fillShip() {
        Captain captain = new Captain();
        crew.add(captain);

        for (int i = 0; i < random.nextInt(30); i++) {
            crew.add(new Pirate());
        }


    }

    public List<Pirate> getPoorPirates() {
        List<Pirate> poor = null;
        for (Pirate one: crew) {
         if ((one.woodenLeg) && one.amountGold < 15 ) {
             poor.add(one);
        }
        }
        return poor;
    }

    public Integer getGolds() {
        int sum = 0;
        for (Pirate one: crew) {
            sum += one.amountGold;
        }
    return sum;
    }

    public void lastDayOnTheShip() {
        System.out.println("party");
    }

    public void prepareForBattle() {
        for (Pirate pirate : crew) {
            pirate.party();
            pirate.party();
            pirate.party();
            pirate.party();
            pirate.party();

           lastDayOnTheShip();
        }
    }
}
