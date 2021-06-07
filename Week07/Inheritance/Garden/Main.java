package Inheritance.Garden;

public class Main {
    public static void main(String[] args) {

        Flower yellow = new Flower("yellow");

        Flower blue = new Flower();

        Tree purple = new Tree();

        Tree orange = new Tree();

        Garden my = new Garden();

        my.addElement(yellow);
        my.addElement(blue);
        my.addElement(purple);
        my.addElement(orange);

        my.state();
        my.watering(40);
        my.state();
    }
}
