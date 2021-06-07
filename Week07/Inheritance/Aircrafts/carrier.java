package Inheritance.Aircrafts;

import java.util.ArrayList;
import java.util.List;

public class carrier {
    List<Aircraft> store = new ArrayList<>();
    private int ammo;
    int health;

    public carrier(int ammo, int health) {
        this.ammo = ammo;
        this.health = health;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void addAircraft(Aircraft aircraft) {
        store.add(aircraft);
    }

    public void fill() {
        int needAmmo = 0;
        for (Aircraft aircraft : store) {
            needAmmo += aircraft.maxAmmo - aircraft.getAmmo();
            if (needAmmo > this.ammo) {
                if (aircraft.isPriority()) {
                    aircraft.setAmmo(this.ammo - ((aircraft.maxAmmo) - aircraft.getAmmo()));
                }
            }
            if (this.ammo == 0) {
                System.err.println("No ammo");
            }
            this.ammo -= needAmmo;
        }
    }

    public void fight(carrier opponent) {
        int aircraftsAmmo = 0;
        for (Aircraft aircraft : store) {
            aircraftsAmmo += aircraft.getAmmo();
        }
        opponent.health -= aircraftsAmmo;
    }

    public void getStatus() {
        int totalDamage = 0;
        System.out.println("HP: " + health + ", Aircraft count: " + this.store.size() + ", Ammo Storage: " + this.ammo + ", Total damage:" + totalDamage + "\nAircrafts:  " );
        for (Aircraft aircraft : store) {


            System.out.println( "Type: " + aircraft.getClass().getSimpleName() + ", Ammo: " + aircraft.getAmmo() + ", Base Damage: " + aircraft.baseDamage + " , All Damage: " + aircraft.damage);
            totalDamage += aircraft.damage;
        }
    }
}
