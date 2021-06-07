package Inheritance.Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private String name;
    private int waterIndex;
    private int waterAmount;
    static int watering;
    protected int whoNeedWater;
    private double waterAbsorption;
    List<Garden> flora = new ArrayList<>();

    public Garden() {

    }

    public Garden(String name) {
        this.name = name;
        this.waterIndex = waterIndex;
        this.waterAmount = 0;
        this.waterAbsorption = waterAbsorption;
    }

    public String getName() {
        return name;
    }

    public void addElement(Garden garden) {
        flora.add(garden);
    }

    public void state() {
        for (Garden garden: flora) {
            if (this.waterIndex >= this.waterAmount) {
                System.out.println("The " + garden.getName() + " " + garden.getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("The " + name + this.getClass() + " doesnt need water");
            }
        }
    }

    public void watering(int watering) {
        whoNeedWater = 0;
        System.out.println("Watering with " + watering);
        watering += watering;
        for (Garden garden : flora) {

            if (garden.waterIndex > garden.waterAmount) {
                whoNeedWater++;
            }
            }
        if (whoNeedWater != 0) {
            this.waterAmount += watering / whoNeedWater * waterAbsorption;
        } else {
            System.out.println("No water necessarily");
        }
    }
}