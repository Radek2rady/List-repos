package Inheritance.Aircrafts;

public class Main {
    public static void main(String[] args) {

        F16 tiger = new F16();

        F35 sniper = new F35();

        carrier home = new carrier(540, 3000);


        F16 tom = new F16();

        F35 homer = new F35();

        carrier toast = new carrier(540, 3000);

        toast.addAircraft(tom);
        toast.addAircraft(homer);


        home.addAircraft(tiger);
        home.addAircraft(sniper);
        home.getStatus();

        home.fight(toast);

        home.getStatus();

        tiger.fight();

        tiger.refill(300);
        System.out.println(tiger.getType());
        System.out.println(tiger.getStatus());
        System.out.println(tom.isPriority());
    }
}
