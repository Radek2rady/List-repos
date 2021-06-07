package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong count;

    public HelloRESTController() {
        count = new AtomicLong(0);
    }

    @GetMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(count.incrementAndGet(), "Hello, " + name);
    }

}
