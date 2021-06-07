package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoofController {
    AtomicLong count;
    int fontsize;
    String[] fizzBuzzWoof = {"Fizz", "Buzz", "Woof"};

    public FizzBuzzWoofController() {
        count = new AtomicLong(1);
    }

    @RequestMapping("/web/fizzbuzz")
    public String greeting(Model model) {
        count.incrementAndGet();
        fontsize = 12;
        //  fontsize = Integer.valueOf(fontsize);
        if (Integer.valueOf(String.valueOf(count)) % 3 == 0 && Integer.valueOf(String.valueOf(count)) % 5 == 0 && Integer.valueOf(String.valueOf(count)) % 7 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[0] + fizzBuzzWoof[1] + fizzBuzzWoof[2]);
            model.addAttribute("fontsize", (6 * fontsize) + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 3 == 0 && Integer.valueOf(String.valueOf(count)) % 5 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[0] + fizzBuzzWoof[1]);
            model.addAttribute("fontsize", 4 * fontsize + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 5 == 0 && Integer.valueOf(String.valueOf(count)) % 7 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[1] + fizzBuzzWoof[2]);
            model.addAttribute("fontsize", 4 * fontsize + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 3 == 0 && Integer.valueOf(String.valueOf(count)) % 7 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[0] + fizzBuzzWoof[2]);
            model.addAttribute("fontsize", 4 * fontsize + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 3 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[0]);
            model.addAttribute("fontsize", 2 * fontsize + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 5 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[1]);
            model.addAttribute("fontsize", 2 * fontsize + "px");
        } else if (Integer.valueOf(String.valueOf(count)) % 7 == 0) {
            model.addAttribute("fizz", fizzBuzzWoof[2]);
            model.addAttribute("fontsize", (2 * fontsize) + "px");
        } else {
            model.addAttribute("fizz", count);
            model.addAttribute("fontsize", fontsize + "px");
        }


        return "fizzbuzz";

    }
}
