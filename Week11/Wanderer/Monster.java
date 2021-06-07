package Wanderer.src;

import java.util.Random;

public class Monster extends Character {

    Random rand = new Random();

    public Monster(String name, int HP, int DP, int SP) {
        super("Monster", 0, 0, 0, 1, true);
        this.name = name;
        this.HP = 2 * this.level * rand.nextInt(6);
        this.DP = this.level / 2 * rand.nextInt(6);
        this.SP = this.level * rand.nextInt(6);
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
