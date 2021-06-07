package RetakeStudy.SantaFactory;

public class DottedBall extends Toy {
    protected int size;
    protected int cost = 10;

    public DottedBall(String color, int size) {
        super(color);
        this.size = size;
    }

    public double getCost() {
        return cost;
    }
}
