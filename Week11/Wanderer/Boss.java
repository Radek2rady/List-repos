package Wanderer.src;

import java.util.Random;

public class Boss extends Character{

    Random rand = new Random();

    public Boss(String name, int HP, int DP, int SP) {
        super("Štětináč", 0, 0, 0, 1, true);
        this.name = name;
        this.HP = 2 * this.level * rand.nextInt(6) + rand.nextInt(6);
        this.DP = this.level / 2 * rand.nextInt(6) + rand.nextInt(6) / 2;
        this.SP = this.level * rand.nextInt(6) + this.level;
        this.level = 1;
        this.alive = true;

    }



    @Override
    public void move() {

    }

    @Override
    public void fight() {

    }
}
