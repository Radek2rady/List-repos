package OOP.Pirates;

public class BattleApp {
    public static void main(String[] args) {

      Ship Morgan = new Ship();

      Ship Barbarossa = new Ship();

      Morgan.fillShip();

      Barbarossa.fillShip();

      Morgan.battle(Barbarossa);



    }
}
