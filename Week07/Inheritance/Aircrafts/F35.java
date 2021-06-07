package Inheritance.Aircrafts;

public class F35 extends Aircraft {
    int maxAmmo = 12;
    int baseDamage = 50;

    public F35() {
        int ammo = 0;
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}
