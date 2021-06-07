package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {
    List<Fox> foxService;

    Fox currentFox;
    List<String> tricksList;
    List<String> foodDrinkList;

//    public List<String> getFoodDrinkList() {
//        return foodDrinkList;
//    }
//
//    public void setFoodDrinkList(List<String> foodDrinkList) {
//        this.foodDrinkList = foodDrinkList;
//    }
//
//    List<String> tricksList = Arrays.asList("Learn Java", "Write HTML", "SQL Databases");
//    List<String> foodDrinkList = Arrays.asList("pizza", "hot dog", "beatle");


    public FoxService() {
        this.foxService = new ArrayList<>();
        this.currentFox = new Fox("Hnup");
        this.tricksList = List.of("Learn Java", "Write HTML", "SQL Databases");
        this.foodDrinkList = List.of("pizza", "hot dog", "beatle");
    }

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }

    public void setCurrentFox(String name) {
        this.currentFox = findFox(name);
    }

    public void add(String name) {
        foxService.add(new Fox(name));
    }

    public List<String> getTricksList() {
        return tricksList;
    }

    public void setTricksList(List<String> tricksList) {
        this.tricksList = tricksList;
    }

    public Fox findFox(String name) {
        for (Fox fox : foxService) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }

//    class FoodDrink {
//        List<String> foodDrinkList = Arrays.asList("pizza", "hot dog", "beatle");
//
//        public List<String> getFoodDrink() {
//            return foodDrinkList;
//        }
//
//        public void setFoodDrink(List<String> foodDrinkList) {
//            this.foodDrinkList = foodDrinkList;
//        }
//    }
//
//    class Tricks {
//        List<String> tricksList = Arrays.asList("Learn Java", "Write HTML", "SQL Databases");
//
//
//        public List<String> getTricksList() {
//            return tricksList;
//        }
//
//        public void setTricksList(List<String> tricksList) {
//            this.tricksList = tricksList;
//        }
//    }

    public void updateFood(String food) {
        currentFox.setFood(food);
    }

    public void learnTrick(String trick) {
        if (this.tricksList.contains(trick) && !this.currentFox.getTricks().contains(trick)) {
            currentFox.getTricks().add(trick);
        }
    }

    public List<String> showUnlearnedTricks() {
        List<String> unlearnedTricks = new ArrayList<>();
        for (String trick : this.getTricksList()) {
            if (!this.currentFox.getTricks().contains(trick)) {
                unlearnedTricks.add(trick);
            }
        }
        return unlearnedTricks;
    }
}