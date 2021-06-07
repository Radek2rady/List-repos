public class Human {
    String name;
    int age;
    int iq;

    public Human() {
        this(null, 0, 0);
    }

    public Human(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public boolean isSmart() {
        return iq > 100;
    }

    public boolean isNameless() {
        return this.name == null || this.name.isEmpty();
    }

    public void beSmarter() {
        this.iq += 20;
    }

    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human("John", 18, 110);

        human.name = "Hector";
        human.age = 1;

        if (human2.isSmart()) {
            System.out.println(human2.name + " is smart, with iq: " + human2.iq);
        }
    }
}