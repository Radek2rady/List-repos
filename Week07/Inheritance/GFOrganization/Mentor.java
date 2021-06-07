package Inheritance.GFOrganization;

public class Mentor extends Person {
    String level;

    public Mentor() {
        super();
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + getLevel() + " mentor.");
    }
}
