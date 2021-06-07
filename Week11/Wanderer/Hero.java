package Wanderer.src;

import java.awt.event.KeyEvent;
import java.util.Random;

public class Hero extends Character{
    Random rand;

    public Hero(String name, int HP, int DP, int SP) {
        super("Mirek Dušín", 0, 0, 0, 1, true);
        this.HP = 20 + 3 * rand.nextInt(6);
        this.DP = 2 * rand.nextInt(6);
        this.SP = 5 + rand.nextInt(6);
        this.level = 1;
        this.alive = true;
        rand = new Random();

    }

    public void face() {

    }

    @Override
    public void move() {

    }

    @Override
    public void fight() {

    }
}
