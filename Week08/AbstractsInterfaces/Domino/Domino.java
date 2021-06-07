package AbstractsInterfaces.Domino;

public class Domino implements Printable {
    public int getSideLeft() {
        return sideLeft;
    }

    public int getSideRight() {
        return sideRight;
    }

    protected int sideLeft;
    protected int sideRight;

    public Domino() {
//        this.sideLeft = 3;
//        this.sideRight = 2;

    }

    public Domino(int sideLeft, int sideRight) {
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
    }

    @Override
    public void printAllFields() {
        System.out.println("Left: " + this.getSideLeft() + ", Right: " + this.getSideRight());
    }
}
