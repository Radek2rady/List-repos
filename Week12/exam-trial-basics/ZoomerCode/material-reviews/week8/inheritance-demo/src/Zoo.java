import animals.Animal;
import animals.Cat;
import animals.GuineaPig;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals; // Polymorphism

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void strokeAnimals() {
        for (Animal animal : animals) {

            if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }
            else if (animal instanceof GuineaPig) {
                ((GuineaPig) animal).squeak();
            }

        }
    }

}
