package RetakeStudy.SantaFactory;

public class JumpingRope extends Toy {
    protected int size;
    protected int cost = 15;

    public JumpingRope(String color, int size) {
        super(color);
        this.size = size;
    }

    public double getCost() {
        return cost;
    }
}
