package Pirates;

public class Captain extends Pirate {
    boolean woodenLeg;
    String name;
    int amountGold;
    int HP;
    boolean isCaptain;

    Captain() {
        this.name = name;
    }

    Captain(String name) {
        super(name);
        this.HP = 10;
    }

    public void work() {
        amountGold += 10;
        HP -= 5;
    }

    public void party() {
        HP += 10;
    }

    public String toString(boolean woodenLeg) {
        if (woodenLeg == true) {
            return "Hello, I'm Jack. I have a wooden leg and 20 golds.";
        } else {
            return "Hello, I'm Jack. I still have my real legs and 20 golds.";
        }
    }
}
