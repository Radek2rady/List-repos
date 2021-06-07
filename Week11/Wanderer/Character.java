package Wanderer.src;

public abstract class Character {
    protected String name;
    protected int HP;
    protected int DP;
    protected int SP;
    protected int level;
    protected boolean alive;

    public Character(String name, int HP, int DP, int SP, int level, boolean alive) {
        this.name = name;
        this.HP = HP;
        this.DP = DP;
        this.SP = SP;
        this.level = level;
        this.alive = alive;
    }


    public abstract void move();

    public abstract void fight();
}
