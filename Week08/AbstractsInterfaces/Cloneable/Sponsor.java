package AbstractsInterfaces.Cloneable;

import Inheritance.GFOrganization.Person;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + getCompany() + " and hired " + getHiredStudents() + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
