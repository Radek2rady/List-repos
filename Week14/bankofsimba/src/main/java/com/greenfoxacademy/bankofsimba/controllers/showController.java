package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.AnimalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.WeakHashMap;

@Controller
public class showController {
    private AnimalRepository animalRepository = new AnimalRepository();

    @GetMapping(value = "/show-animal")
    public String showAnimal(Model model) {
        BankAccount bankAccount = new BankAccount();
        model.addAttribute("bankAccount", bankAccount);
        return "animal";
    }

    @GetMapping("stringShow")
    public String displayString(Model model) {
        String normalText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        String uText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", normalText);
        model.addAttribute("utext", uText);
        return "stringShow";
    }

    @GetMapping("/list-animals")
    public String displayListAnimals(Model model) {
//        BankAccount bankAccount = new BankAccount();
        model.addAttribute("bankAccounts", animalRepository.getBankAccounts());
        return "list-animals";
    }

    @GetMapping("add-animal")
    public String addAnimal() {
        return "add-animal";
    }

    @PostMapping("add-animal")
    public String addAnimal(@ModelAttribute BankAccount bankAccount) {
        animalRepository.addAnimal(bankAccount);
        return "redirect:/list-animals";
    }

    @GetMapping("raise")
    public String raiseGetBalance() {
        return "raise";
    }

    // not working. don't know why

    @PostMapping("raise")
    public String raiseBalance(@ModelAttribute BankAccount bankAccount) {
        Double increment = 10.00;
        if (bankAccount.getName().equals("Simba")) {
            bankAccount.setBalance(increment * 10);
        } else {
            bankAccount.setBalance(increment);
        }
        return "redirect:/list-animals";
    }
}



