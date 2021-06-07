package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Maggie";
        int age = 25;
        String email = "maggie@maggie.com";

        Person p1 = new Person("Maggie", 25, "maggie@maggie.com");
        Person p2 = new Person("Jana");
        p1.greet();
        Person.printNation();
        System.out.println(Person.counter);
        System.out.println(Person.nation);

//        p1.name = "Maggie";
//        p1.age = 25;
//        p1.email = "maggie@maggie.com";

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());

        Circle c = new Circle(5);
        System.out.println(c.countArea());
        c.setDiameter(10);

        System.out.println(c.countArea());

        //example of static method call
        Math.pow(2,3);


    }

}

