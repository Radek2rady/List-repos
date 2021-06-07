package com.greenfoxacademy.hellobeanworld.HelloDIproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    @Autowired
    public Printer() {
    }

    public void log(String message) {
        System.out.println(message);
    }
}