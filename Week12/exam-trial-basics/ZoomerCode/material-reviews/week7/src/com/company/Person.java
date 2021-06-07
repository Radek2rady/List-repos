package com.company;

// class signature
public class Person {

    //attributes and fields part
    private String name;
    private int age;
    private String email;
    public static String nation = "CZ";
    public static int counter = 0;

    //constructors
    public Person(String name, int age, String email) {
//        this(name);

        this.name = name;
        this.age = age;
        this.email = email;
        counter++;
    }

    public Person(String name) {
        this.name = name;
        counter++;
    }

    public Person() {
        this.name = "unknown";
        counter++;
    }

    //methods
    public void greet(){
        System.out.println("Hello, my name is " + this.name);
    }

    public static void printNation(){
        System.out.println(nation);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>8 && age < 99){
            this.age = age;
        }
        System.err.println("wrong");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
