package Inheritance.GFOrganization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {
    private String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + getName() + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }


}
