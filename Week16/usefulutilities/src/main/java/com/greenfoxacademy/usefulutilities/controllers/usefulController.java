package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.IllegalFormatException;

@Controller
public class usefulController {

    @Autowired
    private UtilityService utilityService;


    @GetMapping("useful")
    public String usefulPage() {
        return ("useful");
    }


    @GetMapping("/useful/colored")
    public String randomPage(Model model) {
        model.addAttribute("backgroundcolor", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String validateEmail(@RequestParam String email, Model model) {
        model.addAttribute("address", email);
        if (utilityService.validateEmail(email)) {
            model.addAttribute("validator", "green");
        } else {
            model.addAttribute("validator", "red");
        }
        return "email";
    }

    @GetMapping("/useful/encoder")
    public String encoderCeaser(@RequestParam(defaultValue = "greenfox") String text, @RequestParam(defaultValue = "2") int number, Model model) {
        if (number < 0) {
            throw new IllegalArgumentException("No negative number");
        }
        model.addAttribute("text", utilityService.caesar(text, number));
        return "encoder";
    }

    @GetMapping("/useful/decoder")
    public String decoderCeaser(@RequestParam(defaultValue = "itggphqz") String text, @RequestParam(defaultValue = "2") int number, Model model) {
        if (number < 0) {
            throw new IllegalArgumentException("No negative number");
        }
        model.addAttribute("text", utilityService.caesar(text, Integer.parseInt("-" + number)));
        return "decoder";
    }
}
