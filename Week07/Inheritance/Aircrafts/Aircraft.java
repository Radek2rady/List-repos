package Inheritance.Aircrafts;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    private int ammo;
    int damage;
    int usedAmmo;
    boolean priority;


    public Aircraft() {

    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }


    public int fight() {

        return baseDamage * ammo;
    }

    public int refill(int ammo) {
        usedAmmo = maxAmmo - this.ammo;
        ammo += usedAmmo;
        return ammo - usedAmmo;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + getAmmo() + ", Base Damage " + baseDamage + ", All Damage: " + damage;
    }

    public boolean isPriority() {
        return priority;
    }
}
