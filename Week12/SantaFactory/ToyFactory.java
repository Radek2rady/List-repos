package RetakeStudy.SantaFactory;

import java.util.Random;

public class ToyFactory {
    protected int balance = 200;


    public Toy produce(String color, int size) {
        Random rand = new Random();
        int rand1 = rand.nextInt(2);
        if (rand1 == 0 && this.balance > 10) {
            this.balance -= 10;
            return new DottedBall(color, size);
        } else if (rand1 == 1 && this.balance > 15) {
            this.balance -= 15;
            return new JumpingRope(color, size);
        } else
            return null;
    }

    public Toy produce(String color) {
        if (this.balance > 25) {
            this.balance -= 25;
            return new Doll(color);
        } else
            return null;
    }
}
