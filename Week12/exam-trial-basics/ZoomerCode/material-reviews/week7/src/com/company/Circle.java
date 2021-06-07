package com.company;

public class Circle {

    //field
    private int radius;
    //attribute
    private int diameter;

    public double countArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Circle(int diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    //read
    public int getDiameter() {
        return diameter;
    }

    //write
    public void setDiameter(int diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

//    // the radius i read-only
//    public int getRadius() {
//        return radius;
//    }
}
