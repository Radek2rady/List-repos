package com.gfa.backendapi.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gfa.backendapi.models.*;
import com.gfa.backendapi.models.Appendable;
import com.gfa.backendapi.services.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

//    Error creating bean with name 'inMemoryDatabaseShutdownExecutor'

    @Autowired
    private DoublingService doublingService;
    @Autowired
    private GreeterService greeterService;

    @Autowired
    private UntilService untilService;

    @Autowired
    private LogService logService;

    @Autowired
    private SithService sithService;

    @Autowired
    private HungarianService hungarianService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            logService.SafeNewLog("/doubling");
            return new ResponseEntity<>(new Doubling(input, doublingService.doubling(input)), HttpStatus.OK);
        } else {
            logService.SafeNewLog("/doubling");
            return new ResponseEntity<>(new ErrorDoubling("Please provide an input!"), HttpStatus.OK);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeting(@RequestParam(value = "name", required = false) String name,
                                      @RequestParam(value = "title", required = false) String title) {
        if (name == null && title == null) {
            logService.SafeNewLog("/greeter");
            return new ResponseEntity<>(new ErrorsGreeter("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            logService.SafeNewLog("/greeter");
            return new ResponseEntity<>(new ErrorsGreeter("Please provide a name!"), HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            logService.SafeNewLog("/greeter");
            return new ResponseEntity<>(new ErrorsGreeter("Please provide a title!"), HttpStatus.BAD_REQUEST);
        }
        logService.SafeNewLog("/greeter");
        return new ResponseEntity<>(greeterService.greet(name, title), HttpStatus.OK);
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appenda(@PathVariable(value = "appendable") String appendable) {
        if (appendable == null) {
            logService.SafeNewLog("/appendable");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        logService.SafeNewLog("/appendable");
        return new ResponseEntity<>(new Appendable(appendable + "a"), HttpStatus.OK);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> until(@PathVariable(value = "action", required = false) String action,
                                   @RequestBody Until until) {
        if (action.equals("sum")) {
            var result = untilService.Sum(until.getUntil());
            logService.SafeNewLog("/dountil");
            return new ResponseEntity<>(new UntilResult(result), HttpStatus.OK);
        } else if (action.equals("factor")) {
            var result = untilService.Factorial(until.getUntil());
            logService.SafeNewLog("/dountil");
            return new ResponseEntity<>(new UntilResult(result), HttpStatus.OK);
        } else if (until.getUntil() == null) {
            logService.SafeNewLog("/dountil");
            return new ResponseEntity<>(new ErrorDoubling("Please provide a number!"), HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    @GetMapping("/log")
    public String logEntries(@RequestParam(required = false) Integer page,
                             @RequestParam(required = false) Integer count) throws JsonProcessingException {
        var mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        return mapper.writeValueAsString(logService.writingDTO(page, count));
    }

    @PostMapping("/sith")
    public ResponseEntity<?> reverseSithString(@RequestBody Sith sith) {
        if (sith.getText() != null) {
            SithText sithText = new SithText();
            sithText.setSith_text(sithService.reverseSith(sith).toString());
            return ResponseEntity.ok(sithText);
        }
        return new ResponseEntity<>(new ErrorDoubling("Feed me some text you have to, padawan young you are. Hmmm."), HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/translate")
    public ResponseEntity<?> hungarianCamelIzer(@RequestBody Hungarian hungarian) {
        if (hungarian.getText() != null && hungarian.getLang() != null) {
            Teve teve = new Teve();
            hungarianService.translate(hungarian);
            teve.setTranslated(hungarianService.translate(hungarian));
            hungarianService.replaceLanguage(hungarian);
            teve.setLang(hungarianService.replaceLanguage(hungarian).toString());
            return ResponseEntity.ok(teve);
        }
        return new ResponseEntity<>(new ErrorDoubling("I can't translate that!"), HttpStatus.BAD_REQUEST);
    }
}
