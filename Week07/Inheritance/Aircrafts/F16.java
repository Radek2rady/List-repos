package Inheritance.Aircrafts;

public class F16 extends Aircraft {
    int maxAmmo = 8;
    int baseDamage = 30;

    @Override
    public boolean isPriority() {
        return false;
    }

    public F16() {
        int ammo = 0;

    }
}
