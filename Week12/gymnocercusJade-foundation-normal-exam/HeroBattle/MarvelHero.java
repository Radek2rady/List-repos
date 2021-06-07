package gymnocercusJadeFoundationNormalExam.HeroBattle;

public class MarvelHero extends Hero {
    public MarvelHero(String name, int motivation) {
        super(name, motivation);
    }

    public MarvelHero(String name) {
        super(name);
        this.setMotivation(40);
    }

    @Override
    public double punch(Hero hero) {
        if (hero instanceof MarvelHero) {
            return 0;
        } else if (this.getMotivation() >= 1) {
            return hero.damage = this.getMotivation() / 1.5;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MarvelHero{" +
                "motivation=" + motivation +
                ", damage=" + damage +
                '}';
    }
}
