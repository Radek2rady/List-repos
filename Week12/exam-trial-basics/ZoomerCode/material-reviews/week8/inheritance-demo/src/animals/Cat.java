package animals;

public class Cat extends Animal {   // derived/subclass/child

    private String name;

    public Cat() {
        super(25, 28, 10);
    }

    public Cat(int currentHunger) {
        super(currentHunger, 28, 10);
    }

    public Cat(String name) {
        super();
        this.name = name;
    }

    public void purr() {
        System.out.println("Purrr!");
    }


    @Override
    public void eat() {
        if (!isDead()) {
            hunger--;
            System.out.println("Cat gently purrs into your ear");
        }
        else {
            System.out.println("RIP");
        }
    }

    @Override
    public String toString() {
        return "My cat's name is " + name;
    }
}
