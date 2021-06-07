package Pirates;

public class Pirate {
    String name;
    protected int amountGold;
    int HP;
    boolean woodenLeg;
    boolean isCaptain;


    public int getAmountGold() {
        return amountGold;
    }

    Pirate() {
        this.name = name;
    }

    Pirate(String name) {
        this.name = name;
        this.HP = 10;
    }


    public void work() {
        amountGold += 1;
        HP -= 1;
    }

    public void party() {
        HP += 1;
    }

    public String toString(boolean woodenLeg) {
        if (woodenLeg == true) {
            return "Hello, I'm Jack. I have a wooden leg and 20 golds.";
        } else {
            return "Hello, I'm Jack. I still have my real legs and 20 golds.";
        }
    }
}
