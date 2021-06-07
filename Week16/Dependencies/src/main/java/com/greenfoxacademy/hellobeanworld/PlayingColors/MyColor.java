package com.greenfoxacademy.hellobeanworld.PlayingColors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface MyColor {

    @Autowired
    void printColor();
}