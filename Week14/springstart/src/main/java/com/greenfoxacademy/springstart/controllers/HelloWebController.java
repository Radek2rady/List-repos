package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong count;
    Random ran = new Random();
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public HelloWebController() {
        count = new AtomicLong(1);

    }

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam(name = "name", required = true) String name, @RequestParam int fontsize, @RequestParam String color) {
//        Greeting greeting = new Greeting(count.getAndIncrement(), name);
        model.addAttribute("name", name);
        model.addAttribute("count", count.getAndIncrement());
        model.addAttribute("fontsize", fontsize + "px");
        model.addAttribute("color",  color);
        model.addAttribute("hello", hellos[ran.nextInt(hellos.length)]);

        return "greeting";
    }
}