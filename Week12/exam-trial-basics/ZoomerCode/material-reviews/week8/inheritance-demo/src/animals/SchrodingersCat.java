package animals;

import java.util.Random;

final public class SchrodingersCat extends Cat {

    @Override
    public boolean isDead() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
