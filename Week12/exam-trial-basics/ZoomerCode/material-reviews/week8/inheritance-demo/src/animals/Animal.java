package animals;    // reflects where this file is located in the project structure

public class Animal {       // base class, has its own base class!!! secret one

    protected int hunger;
    final protected int maxHunger;

    protected int hungerPerSleep;

    public Animal() {
        this(5, 30, 5);
    }

    public Animal(int hunger, int maxHunger, int hungerPerSleep) {
        this.hunger = hunger;
        this.maxHunger = maxHunger;
        this.hungerPerSleep = hungerPerSleep;
    }


    public void eat() {
        if (!isDead()) {
            hunger--;
        }
        else {
            System.out.println("RIP");
        }
    }

    public void sleep() {
        if (!isDead()) {
            hunger += hungerPerSleep;
        }
        else {
            System.out.println("RIP");
        }
    }

    public boolean isDead() {
        return hunger > maxHunger;
    }

    public int getHunger() {
        return hunger;
    }

    public int getMaxHunger() {
        return maxHunger;
    }

}
