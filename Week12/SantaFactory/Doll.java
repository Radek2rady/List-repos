package RetakeStudy.SantaFactory;

public class Doll extends Toy {
    protected int cost = 25;

    public Doll(String color) {
        super();
        this.color = color;
    }

    public double getCost() {
        return cost;
    }
}
