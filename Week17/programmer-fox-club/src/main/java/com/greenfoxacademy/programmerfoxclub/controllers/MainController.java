package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

    @Autowired
    FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String getNameCurrentFox(@RequestParam("name") String name) {
        foxService.add(name);
        foxService.setCurrentFox(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/")
    public String index(@RequestParam("name") String name, @RequestParam(value = "tricks", required = false) String tricks, Model model) {
        String food = foxService.getCurrentFox().getFood();
        String drink = foxService.getCurrentFox().getDrink();
//        foxService.learnTrick(trick);
        String firstPar = "This is Mr. " + foxService.getCurrentFox().getName() + ". Currently living on " + food + " and " + drink + ".";
        String nullTricks = "You know no tricks, yet. Go and learn some.";
        model.addAttribute("currentFox", foxService.getCurrentFox());
        model.addAttribute("name", foxService.getCurrentFox().getName());
        model.addAttribute("firstPar", firstPar);
        model.addAttribute("tricks", foxService.getCurrentFox().getTricks());
        model.addAttribute("nrTricks", foxService.getCurrentFox().getTricks().size());

        if (foxService.getCurrentFox().getTricks().size() == 0) {
            model.addAttribute("nullTricks", nullTricks);
        } else {
            for (String trick : foxService.getCurrentFox().getTricks()) {
                model.addAttribute("trick", trick);
            }
        }

        if (name.isEmpty()) {
            model.addAttribute("color", "white");
            model.addAttribute("numberTicks", foxService.getCurrentFox().getTricks().size());
            return "login";
        } else if (!foxService.getCurrentFox().getName().equals(name)) {
            model.addAttribute("color", "red");
            model.addAttribute("error", "You have provided a name that has not been used before, add it as a new one!");
            return "login";
        }
        return "index";
    }

    @GetMapping("/nutritionStore")
    public String nutritionStorePost(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", foxService.getCurrentFox().getName());
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String nutritionStorePost(@RequestParam("food") String food,
                                     @RequestParam("drink") String drink, Model model) {
//        foxService.getCurrentFox().getName();
        foxService.getCurrentFox().setFood(food);
        foxService.getCurrentFox().setDrink(drink);
        model.addAttribute("name", foxService.getCurrentFox().getName());
        model.addAttribute("food", foxService.getCurrentFox().getFood());
        model.addAttribute("drink", foxService.getCurrentFox().getDrink());
        return "redirect:/?name=" + foxService.getCurrentFox().getName();
    }

    @GetMapping("/trickCenter")
    public String trickCenter(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", foxService.getCurrentFox().getName());
        model.addAttribute("tricks", foxService.showUnlearnedTricks());
        return "/trickCenter";
    }

    @PostMapping("/trickCenter")
    public String trickCenterPost(@RequestParam(value = "tricks", required = false) String trick, Model model) {
        foxService.learnTrick(trick);
        model.addAttribute("name", foxService.getCurrentFox().getName());
        model.addAttribute("tricks", foxService.getCurrentFox().getTricks());
        model.addAttribute("unlearnedTricks", foxService.showUnlearnedTricks());
        return "redirect:/?name=" + foxService.getCurrentFox().getName();
    }

}
