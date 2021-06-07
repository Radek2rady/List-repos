package gymnocercusJadeFoundationNormalExam.HeroBattle;

public class DCHero extends Hero{
    public DCHero(String name, int motivation) {
        super(name, motivation);
    }

public DCHero(String name) {
    super(name);
    this.setMotivation(45);
}

    @Override
    public double punch(Hero hero) {
       if (hero instanceof DCHero) {
            return 0;
        } else if (this.getMotivation() >= 1) {
           return hero.damage = this.getMotivation() / 1.5;
       }
        return 0;
    }
}
