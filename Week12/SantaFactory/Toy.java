package RetakeStudy.SantaFactory;

abstract class Toy {
    protected int cost;
    protected String color;

    protected String owner = null;

    public Toy() {

    }

    public Toy(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getCost() {
        return cost;
    }
}
