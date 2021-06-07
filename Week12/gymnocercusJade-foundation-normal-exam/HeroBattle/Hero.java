package gymnocercusJadeFoundationNormalExam.HeroBattle;

public class Hero {
    private String name;
    protected double motivation;
    protected double damage;

    public Hero(String name, int motivation) {
        this.name = name;
        this.motivation = motivation;
    }

    public Hero(String name) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMotivation() {
        return motivation;
    }

    public void setMotivation(double motivation) {
        this.motivation = motivation;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void getMotivationLevel() {
        if (this.getMotivation() <= 25) {
            this.setMotivation(0);
        } else if (this.getMotivation() > 25 && this.getMotivation() < 40) {
            this.setMotivation(1);
        } else if (this.getMotivation() >= 40) {
            this.setMotivation(2);
        }
    }

    public double punch(Hero hero) {
        if (this.getMotivation() >= 1) {
            return damage = this.getMotivation() / 1.5;
        }
        return 0;
    }

    public void bePunched(Hero hero) {
        hero.damage -= Math.ceil(hero.damage / (hero.motivation) / 2);
        hero.setMotivation(hero.damage);
        if (hero.getMotivation() < 0) {
            hero.setMotivation(0);
        }
    }

    @Override
    public String toString() {
        if (this.getMotivation() == 0) {
            return "Hero " + this.getName() + "is not motivated anymore.";
        } else if (this.getMotivation() == 1) {
            return "Hero " + this.getName() + "is is motivated.";
        } else
            return "Hero " + this.getName() + "is well motivated.";
    }
}
