package gymnocercusJadeFoundationNormalExam.HeroBattle;

import java.util.List;

public class Battle {
    private List<Hero> heroes;
    private double teamMotivation;

    public Battle() {

    }

    public double getTeamMotivation() {
        return teamMotivation;
    }

    public void setTeamMotivation(double teamMotivation) {
        this.teamMotivation = teamMotivation;
    }

    public Hero avengersAssemble(List<Hero> heroes) {
        for (Hero hero : heroes) {
            if (hero instanceof MarvelHero && hero.motivation == 2) {
                return hero;
            }
        }
        return null;
    }

        public void startBattle(Hero otherHeroes) {
            for (Hero hero: heroes) {
                for (avengersAssemble(heroes)) {
                    hero.punch(otherHeroes);
                    hero.bePunched(otherHeroes);
                }
            }
        }

        public double calculateMotivation(List<Hero> heroes) {
            for (Hero hero: heroes) {
                this.teamMotivation += hero.getMotivation();
            }
            return this.teamMotivation;
        }

    public double calculateOtherHeroesMotivation(List<Hero> otherHeroes) {
        for (Hero hero: heroes) {
            this.teamMotivation += hero.getMotivation();
        }
        return this.teamMotivation;
    }


    @Override
    public String toString() {
        if (!(this.teamMotivation == teamMotivation)) {
            return "Battle{" +
                    "heroes=" + this.heroes +
                    ", teamMotivation=" + this.teamMotivation +
                    '}';
        } else {
            return heroes.toString();
        }
    }
}
