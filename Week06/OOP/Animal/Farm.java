package OOP.Animal;

import java.util.List;

public class Farm {
    List<Animal> animals;
    int place;
    int slot;

    public Farm() {

    }

    public Farm(int slot) {
        slot = slot;
    }

    public void breed() {
        if (place > slot) {
            Animal animal1 = new Animal();
        }
    }

    public void slaughter() {
        int leastHungry = 0;
        for (Animal animal : this.animals) {
            if (leastHungry == 0) {
                leastHungry = animal.getHunger();
            }
            if (animal.getHunger() < leastHungry) {
            }
            if (animal.getHunger() == leastHungry) {
                animal = null;
            }
        }
    }


}
