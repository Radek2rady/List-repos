package com.gfa.humandatabase.controllers;

import com.gfa.humandatabase.models.Human;
import com.gfa.humandatabase.models.HumanDTO;
import com.gfa.humandatabase.repositories.HumanRepository;
import com.gfa.humandatabase.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class HumanController {

    @Autowired
    private HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/humans")
    public String locationsFilter(@RequestParam(value = "location", required = false) String location,
                                  Model model) {
        if (location == null) {
            return "badrequest";
        } else {
            model.addAttribute("humans", humanService.findByLocation(location));
            model.addAttribute("location", location);
            return "humans";
        }
    }

    @GetMapping("/humans/aggregate")
    public String aggregatePage(Model model, String gender, String location) {
        model.addAttribute("averageAge", humanService.avgAge());
        model.addAttribute("percentageMale", humanService.percentageMens());
        model.addAttribute("percentageFemale", 100 - humanService.percentageMens());
        model.addAttribute("topLocation", humanService.topLocation());
        return "aggregate";
    }

    @PostMapping("/api/humans")
    public ResponseEntity<?> humansPost(@RequestBody HumanDTO humanDTO) {
        if ((humanDTO.getGender().equals("male") || humanDTO.getGender().equals(("female"))) &&
                (!humanDTO.getFirstName().equals(null)) &&
                (!humanDTO.getLastName().equals(null)) &&
                (humanDTO.getAge() != 0) && (!humanDTO.getGender().equals(null) &&
                (!humanDTO.getLocation().equals(null)))) {
            humanService.addHuman(humanDTO);
            return new ResponseEntity<>(new HumanDTO(), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
