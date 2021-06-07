package RetakeStudy.SantaFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Santa {
    List<Toy> toys;
    List<String> children;

    public Santa(List<String> children) {
        this.children = children;
    }

    public void addToyToBag(String color, int size) {
        ToyFactory toyFactory = new ToyFactory();
        Random rand = new Random();
        int rand2 = rand.nextInt(2);
        if (rand2 == 0) {
            toys.add(toyFactory.produce(color));

        } else
            toys.add(toyFactory.produce(color, size));
    }

    public void bringToChildren() {
        Toy toy = null;
        List<String> namesToday = Arrays.asList("Lacika", "Sanyika");
        while ((!namesToday.isEmpty()) || (!this.toys.isEmpty())) {
            for (String name : namesToday) {
                toy.setOwner(name);
                children.remove(name);
                toys.remove(toy);
            }
        }
    }

}
