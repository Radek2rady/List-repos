package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fox {
    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        this.drink = "beer";
        this.food = "schnitzel";
        this.tricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getTrick(int number) {
        String trick = tricks.get(number);
        return trick;
    }

    private void addTrickToFox(int number) {
        var trick = getTrick(number);
        this.getTrick(number);
        tricks.remove(number);
    }


}
